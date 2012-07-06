/**
 * 
 */
package com.example.user;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Entity
@Cacheable(true)
public class Admin extends AbstractUser {

    /**
     * 
     */
    private static final long serialVersionUID = -8918046636801106791L;

    
    public Admin() {
        
    }
    public Admin(long id) {
        setId(id);
    }

    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

}
