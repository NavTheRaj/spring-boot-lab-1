package com.navraj.springbootclass.repo;

import com.navraj.springbootclass.entity.Comment;
import com.navraj.springbootclass.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepo extends CrudRepository<Comment, Long> {

    List<Comment> findAll();

    Comment findById(int id);

    Comment save(Post p);

    void deleteById(int id);
}
