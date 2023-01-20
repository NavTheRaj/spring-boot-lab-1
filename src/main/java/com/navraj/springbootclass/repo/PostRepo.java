package com.navraj.springbootclass.repo;

import com.navraj.springbootclass.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findAll();

    Post findById(int id);

    Post save(Post p);

    void deleteById(int id);

    List<Post> findPostsByTitleIs(String title);
}
