package com.example.webbackend.business.dao;

import com.example.webbackend.business.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<DirectorEntity, Long> {
}
