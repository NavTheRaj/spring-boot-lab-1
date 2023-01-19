package com.navraj.springbootclass.service;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(long id);

    User save(User user);

//    @Query("SELECT p from Post p WHERE p.user.id = :id")
    List<Post> getPostsById(long id);

    List<User> findUsersByPostsGreaterThan();
}
