package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.DirectorEntity;
import com.example.webbackend.web.dto.director.DirectorDto;
import org.mapstruct.Mapper;

@Mapper
public interface DirectorMapper extends GenericMapper<DirectorDto, DirectorEntity> {
}
