package com.navraj.springbootclass.service;
import com.navraj.springbootclass.entity.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> findAll();

    Comment findById(int id);

    Comment save(Comment p);

    void deleteById(int id);
}
