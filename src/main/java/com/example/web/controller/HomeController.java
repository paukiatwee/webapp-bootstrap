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
}
