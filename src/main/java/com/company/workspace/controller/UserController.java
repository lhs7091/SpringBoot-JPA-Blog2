package com.company.workspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping({"/auth/signupForm", "/auth/signinForm"})
    public String index(){
        return"/index.html";
    }

}
