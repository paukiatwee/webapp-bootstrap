/**
 * 
 */
package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Pau Kiat Wee
 *
 */
@Controller
@RequestMapping(value = "/")
public class FrontController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "front/index";
    }
    
}
