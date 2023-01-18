package com.navraj.springbootclass.service.impl;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.dto.PostDto;
import com.navraj.springbootclass.entity.dto.PostDto2;
import com.navraj.springbootclass.helper.EntityListMapper;
import com.navraj.springbootclass.repo.PostRepo;
import com.navraj.springbootclass.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    EntityListMapper<Post, PostDto> postDtoEntityListMapper;

    @Autowired
    EntityListMapper<Post, PostDto2> postDto2EntityListMapper;

    @Override
    public List<PostDto> findAll() {

        /*
        First Approach Instant Mapping
        --------------------------------
        return postRepo
                .findAll()
                .stream()
                .map(p -> modelMapper.map(p, PostDto.class))
                .collect(Collectors.toList());

         */

        return postDtoEntityListMapper.map(postRepo.findAll(), new PostDto());
    }

    public List<PostDto2> findAllPostDto2() {
        return postDto2EntityListMapper.map(postRepo.findAll(), new PostDto2());
    }

    @Override
    public PostDto findById(int id) {
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public void save(PostDto p) {
        postRepo.save(modelMapper.map(p, Post.class));
    }

    @Override
    public void delete(int id) {
        postRepo.delete(id);
    }

    @Override
    public void update(int id, PostDto p) {
        postRepo.update(id, modelMapper.map(p, Post.class));
    }
}
