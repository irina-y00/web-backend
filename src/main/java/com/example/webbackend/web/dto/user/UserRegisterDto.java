package com.example.webbackend.web.dto.user;

import com.example.webbackend.business.enums.AuthorityEnum;
import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class UserRegisterDto implements ParentDto {
    private String username;
    private String phone;
    private String password;
    private String firstName;
    private String secondName;
    private String patronymic;
    @Enumerated(EnumType.STRING)
    private AuthorityEnum authority;
}
