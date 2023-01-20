package com.navraj.springbootclass.service;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.dto.PostDto;
import com.navraj.springbootclass.entity.dto.PostDto2;

import java.util.List;

public interface PostService {
    List<PostDto> findAll();

    List<PostDto2> findAllPostDto2();

    PostDto findById(int id);

    Post save(PostDto p);

    void delete(int id);

    void update(int id, PostDto p);

    List<PostDto> findPostsByTitleIs(String title);
}
