package com.company.workspace.controller;

import com.company.workspace.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping({"","/"})
    public String index(){
        return "/index.html";
    }

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("boards", boardService.boardList());
        return "/home.html";
    }

    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "/board/write.html";
    }

}
