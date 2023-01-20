package com.navraj.springbootclass.controller;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.dto.PostDto;
import com.navraj.springbootclass.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/*
    This file is without any versioning just intends to show simple CRUD in Restful API.
    Every request should pass through localhost:8080/api/v1/posts/** in order to do those
    operations.
 */

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDto findPostById(@PathVariable("id") int id) {
        return postService.findById(id);
    }

    @GetMapping(value = "/filter",params = "authorName")
    public List<PostDto> findPostByAuthor(@RequestParam(value = "authorName") String authorName) {
        return findAll()
                .stream()
                .filter(postDto -> postDto.getAuthor().equals(authorName))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/filter",params = "title")
    public List<PostDto> findPostByTitleIs(@RequestParam(value = "title") String title){
        return postService.findPostsByTitleIs(title);
    }

    @PostMapping
    public void save(@RequestBody PostDto postDto) {
        postService.save(postDto);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") int id,
                       @RequestBody PostDto postDto) {
        postService.update(id, postDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") int id) {
        postService.delete(id);
    }

}
