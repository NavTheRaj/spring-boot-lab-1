package com.navraj.springbootclass.service.impl;

import com.navraj.springbootclass.entity.Comment;
import com.navraj.springbootclass.repo.CommentRepo;
import com.navraj.springbootclass.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepo commentRepo;

    @Override
    public List<Comment> findAll() {
        return commentRepo.findAll();
    }

    @Override
    public Comment findById(int id) {
        return commentRepo.findById(id);
    }

    @Override
    public Comment save(Comment p) {
        return commentRepo.save(p);
    }

    @Override
    public void deleteById(int id) {
        commentRepo.deleteById(id);
    }
}
