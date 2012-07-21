/**
 * 
 */
package com.example.web.controller;

import com.example.user.User;
import com.example.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Map;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Controller
@RequestMapping(value = "/secure")
public class HomeController {

    private UserService userService;

    @Inject
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(value = "/home")
    public String home() {
        return "secure/home";
    }
    
    @RequestMapping(value = "/about")
    public String about() {
        return "secure/about";
    }
    
    @RequestMapping(value = "/contact")
    public String contact() {
        return "secure/contact";
    }
    
    @RequestMapping(value = "/profile")
    public String profile() {
        return "secure/profile";
    }
    
    @RequestMapping(value = "/settings")
    public String settings() {
        return "secure/settings";
    }

    @RequestMapping(value = "/users")
    public String getUsers(Map<String, Object> m, HttpSession session) {
        m.put("isDeleteSuccess", session.getAttribute("isDeleteSuccess"));
        session.removeAttribute("isDeleteSuccess");
        m.put("list", userService.getAllAdmins());
        return "secure/users";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user(Map<String, Object> m, HttpSession  session) {
        m.put("isCreateSuccess", session.getAttribute("isCreateSuccess"));
        m.put("model", new User());
        session.removeAttribute("isCreateSuccess");
        return "secure/user";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String show(Map<String, Object> m, @PathVariable long id, HttpSession  session) {
        m.put("isUpdateSuccess", session.getAttribute("isUpdateSuccess"));
        m.put("model", userService.read(id));
        m.put("isEdit", Boolean.TRUE);
        session.removeAttribute("isUpdateSuccess");
        return "secure/user";
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String update(Map<String, Object> m, @ModelAttribute("model") @Valid User model, BindingResult result, HttpSession  session) {

        if(result.hasErrors()) {
            m.put("isEdit", Boolean.TRUE);
            return "secure/user";
        }
        userService.update(model);
        session.setAttribute("isUpdateSuccess", Boolean.TRUE);
        return "redirect:/secure/user/" + model.getId();
    }
    
    @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
    public String delete(@RequestParam long id, HttpSession  session) {
        
        userService.delete(id);
        session.setAttribute("isDeleteSuccess", Boolean.TRUE);
        return "redirect:/secure/users";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(Map<String, Object> m, @ModelAttribute("model") @Valid User model, BindingResult result, HttpSession session) {
        if(result.hasErrors()) {
            return "secure/user";
        }
        session.setAttribute("isCreateSuccess", Boolean.TRUE);
        userService.add(model);
        return "redirect:/secure/user";
    }
    
}
