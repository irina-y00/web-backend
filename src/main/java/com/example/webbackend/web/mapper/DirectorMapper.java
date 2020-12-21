package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.DirectorEntity;
import com.example.webbackend.business.entity.GenreEntity;
import com.example.webbackend.web.dto.director.DirectorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface DirectorMapper extends GenericMapper<DirectorDto, DirectorEntity> {

    @Mapping(target = "id", source = "directorId")
    DirectorEntity fromId(Long directorId);

    List<DirectorEntity> toNewsEntity(List<Long> ids);
}
