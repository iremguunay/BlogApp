package com.bilgeadam.blogapp.repository;

import com.bilgeadam.blogapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
