package com.example.webbackend.business.dao;

import com.example.webbackend.business.entity.InfoFilmsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface InfoFilmsRepository  extends JpaRepository<InfoFilmsEntity, Long> {
}
