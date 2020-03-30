package com.expencesiveTime.slience.controller;

import com.expencesiveTime.slience.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/user/{id}")
    public String getUser(Model model, @PathVariable("id") int id){
        model.addAttribute("user",userService.getUser(id));
        return "user";
    }
}
