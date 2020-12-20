package com.example.webbackend.business.dao;

import com.example.webbackend.business.entity.AuthorityEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends PagingAndSortingRepository<AuthorityEntity,Integer> {
    AuthorityEntity findAllByName(String name);
}

