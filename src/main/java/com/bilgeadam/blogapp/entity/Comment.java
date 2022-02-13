package com.bilgeadam.blogapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;

}
