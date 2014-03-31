/**
 * 
 */
package com.example.web.controller;

import com.example.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.Map;
import java.util.TimeZone;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Controller
@RequestMapping(value = "/secure")
public class SecureController {

    private UserService userService;

    @Inject
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(value = "/home")
    public String home() {
        return "/secure/home";
    }
    
    @RequestMapping(value = "/about")
    public String about() {
        return "/secure/about";
    }
    
    @RequestMapping(value = "/contact")
    public String contact() {
        return "/secure/contact";
    }
    
    @RequestMapping(value = "/profile")
    public String profile() {
        return "/secure/profile";
    }
    
    @RequestMapping(value = "/settings")
    public String settings() {
        return "/secure/settings";
    }
    
    @RequestMapping(value = "/system", method = RequestMethod.GET)
    public String system(Map<String, Object> m) {
        m.put("properties", System.getenv());
        m.put("timeZone", TimeZone.getDefault());
        return "/secure/system";
    }
}
