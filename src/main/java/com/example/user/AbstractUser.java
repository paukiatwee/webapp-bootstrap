/**
 * 
 */
package com.example.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
abstract class AbstractUser implements UserDetails {

    /**
     * 
     */
    private static final long serialVersionUID = 8399544408338444314L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;

    
    
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the accountNonExpired
     */
    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }
    /**
     * @param accountNonExpired the accountNonExpired to set
     */
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }
    /**
     * @return the accountNonLocked
     */
    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }
    /**
     * @param accountNonLocked the accountNonLocked to set
     */
    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }
    /**
     * @return the credentialsNonExpired
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }
    /**
     * @param credentialsNonExpired the credentialsNonExpired to set
     */
    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }
    /**
     * @return the enabled
     */
    @Override
    public boolean isEnabled() {
        return enabled;
    }
    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
}
