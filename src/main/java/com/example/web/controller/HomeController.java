/**
 * 
 */
package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Controller
@RequestMapping(value = "/secure")
public class HomeController {
    
    @RequestMapping(value = "home")
    public String home() {
        return "secure/home";
    }
    
    @RequestMapping(value = "about")
    public String about() {
        return "secure/about";
    }
    
    @RequestMapping(value = "contact")
    public String contact() {
        return "secure/contact";
    }
    
}
