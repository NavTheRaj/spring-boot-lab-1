package com.navraj.springbootclass.service;

import com.navraj.springbootclass.entity.dto.PostDto;
import com.navraj.springbootclass.entity.dto.PostDto2;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();

    public List<PostDto2> findAllPostDto2();

    public PostDto findById(int id);

    public void save(PostDto p);

    public void delete(int id);

    public void update(int id, PostDto p);
}
