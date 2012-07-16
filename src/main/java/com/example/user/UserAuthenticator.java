/**
 * 
 */
package com.example.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Service
class UserAuthenticator implements UserDetailsService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAuthenticator.class.getName());
    
    private EntityManager entityManager;


    @PersistenceContext
    public  void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        
        LOGGER.debug("Try to authenticate user[{}]", username);
        
        TypedQuery<Admin> q = entityManager.createQuery("FROM Admin WHERE username = :username", Admin.class).setParameter("username", username);

        return q.getSingleResult();
    }

}
