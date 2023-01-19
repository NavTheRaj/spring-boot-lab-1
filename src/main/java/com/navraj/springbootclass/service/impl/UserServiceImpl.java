package com.navraj.springbootclass.service.impl;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.User;
import com.navraj.springbootclass.repo.PostRepo;
import com.navraj.springbootclass.repo.UserRepo;
import com.navraj.springbootclass.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<Post> getPostsById(long id) {
        return userRepo.getPostsById(id);
    }

    @Override
    public List<User> findUsersByPostsGreaterThan() {
        return userRepo.findUsersWithMoreThanOnePost();
    }

}
