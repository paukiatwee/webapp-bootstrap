/**
 * 
 */
package com.example.mail;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.core.task.TaskExecutor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.user.User;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 * @since 1.0.0
 */
@Service
public class DefaultMailService implements MailService {
    
    private JavaMailSender mailSender;
    private SimpleMailMessage templateMessage;
    private TaskExecutor executor;
    private boolean isAsync;
    
    @Inject
    public DefaultMailService(JavaMailSender mailSender, SimpleMailMessage templateMessage, TaskExecutor executor) {
        this.mailSender = mailSender;
        this.templateMessage = templateMessage;
        this.executor = executor;
    }
    
    public void setIsAsync(boolean isAsync) {
        this.isAsync = isAsync;
    }

    @Override
    public void sendTo(User user, String content) throws MessagingException, UnsupportedEncodingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        helper.setFrom(new InternetAddress(templateMessage.getFrom(), "Noreply Example.com"));
        helper.setTo(new InternetAddress("admin@example.com"));
        helper.setSubject("Subject");
        helper.setText(content, true);
        if(isAsync) {
            executor.execute(new AsyncMailTask(mimeMessage));
        } else {
            mailSender.send(mimeMessage);            
        }
    }

    private class AsyncMailTask implements Runnable {
        
        private MimeMessage message;
 
        private AsyncMailTask(MimeMessage message) {
            this.message = message;
        }
 
        public void run() {
            mailSender.send(message);
        }
    }
}
