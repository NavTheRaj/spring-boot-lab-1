package com.navraj.springbootclass.controller;

import com.navraj.springbootclass.aspect.annotation.ExecutionTime;
import com.navraj.springbootclass.entity.Comment;
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

    @ExecutionTime
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

    @GetMapping(value = "/filter", params = "posts")
    public List<User> findUsersByPostsGreaterThan1(@RequestParam("posts") int size) {
        return userService.findUsersByPostsGreaterThan(size);
    }

    @GetMapping(value = "/filter", params = "title")
    public List<User> findUsersWithPostsTitleWithin(@RequestParam("title") String title) {
        return userService.findUsersWithPostsTitleWithin(title);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }

    /*
    navigate from your user to a post, then to a comment
     */

    @GetMapping("/{userId}/posts/{postId}/comments/{commentId}")
    public Comment findCommentOfUserThroughPost(
            @PathVariable("userId") long userId,
            @PathVariable("postId") long postId,
            @PathVariable("commentId") long commentId
    ) {
        return userService.findCommentOfUserThroughPost(userId, postId, commentId);
    }
}
