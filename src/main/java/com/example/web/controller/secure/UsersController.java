package com.example.web.controller.secure;

import com.example.user.User;
import com.example.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping(value = "/secure/users")
public class UsersController {

    private UserService userService;

    @Inject
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Map<String, Object> m) {
        m.put("list", userService.getAllAdmins());
        return "/secure/users";
    }


    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newUser(Map<String, Object> m) {
        m.put("model", new User());
        return "/secure/users/new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createUser(Map<String, Object> m, @ModelAttribute("model") @Valid User model, BindingResult result, RedirectAttributes redirectAttributes) {
        if(result.hasErrors()) {
            return "/secure/users/new";
        }
        userService.update(model);
        redirectAttributes.addFlashAttribute("success", Boolean.TRUE);
        redirectAttributes.addFlashAttribute("successMessage", "Successfully added new User");
        return "redirect:/secure/users";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String view(Map<String, Object> m, @PathVariable long id) {
        m.put("model", userService.read(id));
        return "/secure/users/edit";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String update(Map<String, Object> m, @ModelAttribute("model") @Valid User model, BindingResult result, RedirectAttributes redirectAttributes) {
        if(result.hasErrors()) {
            return "/secure/users/edit";
        }
        userService.update(model);
        redirectAttributes.addFlashAttribute("success", Boolean.TRUE);
        redirectAttributes.addFlashAttribute("successMessage", "Successfully update existing User");
        return "redirect:/secure/users";
    }
}
