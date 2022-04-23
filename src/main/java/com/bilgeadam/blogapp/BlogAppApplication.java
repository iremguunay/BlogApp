package com.bilgeadam.blogapp;

import com.bilgeadam.blogapp.entity.Comment;
import com.bilgeadam.blogapp.entity.Post;
import com.bilgeadam.blogapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogAppApplication implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Post post = new Post();
        post.setTitle("6 Algorithms Every Developer Should Know");
        post.setDescription("Data Structures and Algorithms aren’t really my thing.");

        Comment comment1 = new Comment();
        comment1.setText("Loved it!");

        Comment comment2 = new Comment();
        comment2.setText("Great post!");

        Comment comment3 = new Comment();
        comment3.setText("Thanks you, it became very helpful resource for me.");

        post.getComments().add(comment1);
        post.getComments().add(comment2);
        post.getComments().add(comment3);

        postRepository.save(post);

    }
}
