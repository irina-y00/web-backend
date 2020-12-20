package com.example.webbackend.business.dao;

import com.example.webbackend.business.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<CommentEntity, Long> {
}
