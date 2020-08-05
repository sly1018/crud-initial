package com.slay.initialcrud.controller;

import com.slay.initialcrud.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private PostService postService;

    @Autowired
    public HomeController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("post", postService.getLatestPost());
        return "index";
    }
}
