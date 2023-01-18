package com.navraj.springbootclass.controller;
import com.navraj.springbootclass.entity.dto.PostDto2;
import com.navraj.springbootclass.service.PostService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/*
    This file just intends to demonstrate versioning for v2. There is a simple Rest
    Controller named PostController for a single versioning restful services.
 */

@RestController
@RequestMapping("/api")
public class VersioningPostController {

    private final PostService postService;

    public VersioningPostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/v2/posts")
    public List<PostDto2> findAllPostDto2() {
        return postService.findAllPostDto2();
    }

}

