/**
 * 
 */
package com.example.mail;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import com.example.user.User;

/**
 * Mail service used to send email
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 * @since 1.0.0
 */
public interface MailService {
    
    
    void sendTo(User user, String content) throws MessagingException, UnsupportedEncodingException;

}
