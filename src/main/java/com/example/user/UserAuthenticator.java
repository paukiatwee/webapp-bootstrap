/**
 * 
 */
package com.example.user;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Service
class UserAuthenticator implements UserDetailsService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAuthenticator.class.getName());
    
    private PasswordEncoder encoder;
    
    @Inject
    public void setPasswordEncoder(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        
        LOGGER.debug("Try to authenticate user[{}]", username);
        
        // TODO implement your own authenticator
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword(encoder.encodePassword("admin", null));
        return admin;
    }

}
