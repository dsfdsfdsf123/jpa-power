package com.jpa.jpapower.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liugang
 * @create 2018/12/4 22:27
 **/
@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(Model model){
        String name = "1234";
        model.addAttribute("name",name);
        return "/login";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}
