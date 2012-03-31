/**
 * 
 */
package com.example.user;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
public class Admin extends AbstractUser {

    /**
     * 
     */
    private static final long serialVersionUID = -8918046636801106791L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

}
