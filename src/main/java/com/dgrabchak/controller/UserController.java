package com.dgrabchak.controller;

import com.dgrabchak.model.User;
import com.dgrabchak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("login");
        vm.addObject("user", new User());
        return vm;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("user") User user) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", userService.getByEmail(user));
        mv.setViewName("welcome");

        return mv;
    }

    @RequestMapping(path = "/signup", method = RequestMethod.GET)
    public ModelAndView signUpPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("signup");
        mv.addObject("user", new User());

        return mv;
    }

    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public ModelAndView signUp(@ModelAttribute("user") User user) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", userService.addUser(user));
        mv.setViewName("welcome");

        return mv;
    }

    @RequestMapping(value = "/activation/{token}", method = RequestMethod.GET)
    public ModelAndView activation(@PathVariable String token) {
        ModelAndView vm = new ModelAndView();

        return vm;
    }
}
