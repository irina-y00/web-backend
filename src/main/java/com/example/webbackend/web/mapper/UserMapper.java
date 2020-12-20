package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.UserEntity;
import com.example.webbackend.web.dto.user.UserDto;
import com.example.webbackend.web.dto.user.UserRegisterDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<UserRegisterDto, UserEntity>, GenericReadMapper<UserDto, UserEntity>{
}
