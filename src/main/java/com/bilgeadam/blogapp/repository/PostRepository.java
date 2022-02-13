package com.bilgeadam.blogapp.repository;

import com.bilgeadam.blogapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
