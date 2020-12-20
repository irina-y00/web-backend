package com.example.webbackend.business.service;

import com.example.webbackend.business.entity.AuthorityEntity;
import com.example.webbackend.business.entity.UserEntity;
import com.example.webbackend.business.enums.AuthorityEnum;
import com.example.webbackend.web.dto.user.UserDto;
import com.example.webbackend.web.dto.user.UserRegisterDto;
import com.example.webbackend.web.dto.user.UserUpdateDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface UserService extends UserDetailsService {
    UserEntity findById(UUID id);

    UserEntity findByEmail(String email);

    UserDto findDtoById(UUID id);

    List<UserDto> findAllDto();

    void update(UserUpdateDto userDto);

    void delete(UUID id);

    UserEntity save(UserEntity user);

    AuthorityEntity findAuthorityByName(AuthorityEnum authority);

    UUID register(UserRegisterDto newUser);

    void confirmUser(UserEntity user);

    void blockSwitch(UUID userId);

    Map<String, Object> getAdditionInformation(OAuth2Authentication auth);

    List<UserEntity> byAuthority(String authorityName);

    void checkResolution(UUID id);

}
