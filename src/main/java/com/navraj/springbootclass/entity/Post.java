package com.navraj.springbootclass.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String author;

    @ManyToOne
    @JsonBackReference
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    @JsonManagedReference
    private List<Comment> comment;
}
