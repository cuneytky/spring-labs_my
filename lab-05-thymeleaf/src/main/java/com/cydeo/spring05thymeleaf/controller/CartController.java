package com.cydeo.spring05thymeleaf.controller;


import com.cydeo.spring05thymeleaf.service.impl.CartServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String getCart(Model model){

        model.addAttribute("cart", CartServiceImpl.CART);
        return "cart/show-cart";
    }
}