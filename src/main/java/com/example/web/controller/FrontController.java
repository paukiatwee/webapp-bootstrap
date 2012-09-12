/**
 * 
 */
package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Controller
@RequestMapping(value = "/")
public class FrontController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model m, @RequestParam(value = "login_error", required = false , defaultValue = "none") String error) {
        if("".equals(error)) {
            m.addAttribute("isLoginError", "true");
        }
        return "front/index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model m) {
        return "front/about";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin() {
        return "front/signin";
    }

}
