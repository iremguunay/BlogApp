package com.bilgeadam.blogapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private List<Comment> comments = new ArrayList<>();
}
