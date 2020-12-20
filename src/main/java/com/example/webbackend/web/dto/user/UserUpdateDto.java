package com.example.webbackend.web.dto.user;

import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
public class UserUpdateDto implements ParentDto {
    private UUID id;
    @NotBlank
    private String username;
    private String password;
    private String firstName;
    private String secondName;
    private String patronymic;
    private Boolean updatePassword;
}