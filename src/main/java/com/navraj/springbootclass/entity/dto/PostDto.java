package com.navraj.springbootclass.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.navraj.springbootclass.entity.User;
import lombok.Data;

@Data
//@JsonIgnoreProperties(value = { "user" })
public class PostDto {
    private long id;
    private String title;
    private String content;
    private String author;
    private int userId;
}