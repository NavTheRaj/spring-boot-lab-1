package com.navraj.springbootclass.repo;

import com.navraj.springbootclass.entity.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> findAll();

    public Post findById(int id);

    public void save(Post p);

    public void delete(int id);

    public void update(int id, Post p);

}
