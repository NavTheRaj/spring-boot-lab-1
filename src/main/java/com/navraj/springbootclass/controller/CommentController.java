package com.navraj.springbootclass.controller;

import com.navraj.springbootclass.entity.Comment;
import com.navraj.springbootclass.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> findAll(){
        return commentService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Comment comment) {
        commentService.save(comment);
    }


}
