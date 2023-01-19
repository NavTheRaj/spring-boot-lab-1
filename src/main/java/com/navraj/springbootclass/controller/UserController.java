package com.navraj.springbootclass.controller;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.User;
import com.navraj.springbootclass.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post> getPostById(@PathVariable("id") long id) {
        return userService.getPostsById(id);
    }

    @GetMapping("/filter")
    public List<User> findUsersByPostsGreaterThan1() {
        return userService.findUsersByPostsGreaterThan();
    }
}
