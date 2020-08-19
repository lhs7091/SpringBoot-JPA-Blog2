package com.company.workspace.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkControllerTest {

    @GetMapping("/test/index")
    public String index(){
        return "/templates/index.html";
    }

    @GetMapping("/test/home")
    public String home(){
        return "/templates/home.html";
    }

    @GetMapping("/test/hello")
    public String hello(){

        return "<h1>hello Spring boot</h1>";
    }

}
