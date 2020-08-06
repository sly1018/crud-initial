package com.slay.initialcrud.controller;

import com.slay.initialcrud.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        super();
        this.postService = postService;
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("posts", postService.list());
        return "post/list";
    }

    @RequestMapping("view/{slug]")
    public String view(@PathVariable(value = "slug") String slug, Model model) {
        model.addAttribute("post", postService.getBySlug(slug));
        return "post/view";
    }

    @RequestMapping("/Author/{id}")
    public String byAuthor(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("posts", postService.listByAuthor(id));
        return "post/list";
    }
}
