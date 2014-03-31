/**
 * 
 */
package com.example.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collections;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Service
@Transactional(readOnly = true)
class UserAuthenticator implements UserDetailsService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAuthenticator.class.getName());
    
    private EntityManager entityManager;
    private RoleHierarchy roleHierarchy;


    @PersistenceContext
    public  void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Inject
    public void setRoleHierarchy(RoleHierarchy roleHierarchy) {
        this.roleHierarchy = roleHierarchy;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        LOGGER.debug("Try to authenticate user[{}]", username);

        TypedQuery<User> q = entityManager.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username);

        try {
            User user = q.getSingleResult();
            user.setAuthorities(roleHierarchy.getReachableGrantedAuthorities(Collections.singletonList(new SimpleGrantedAuthority(user.getType().getRole()))));
            System.out.println(user.getAuthorities());
            return user;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return null;
        }
    }

}
