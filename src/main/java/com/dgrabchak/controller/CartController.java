package com.dgrabchak.controller;

import com.dgrabchak.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView getCart(@RequestParam(name = "cart_id") Long id) {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("cart");
        vm.addObject("cart", cartService.getById(id));

        return vm;
    }
}