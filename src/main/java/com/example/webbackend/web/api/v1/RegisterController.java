package com.example.webbackend.web.api.v1;


import com.example.webbackend.business.service.UserService;
import com.example.webbackend.web.dto.user.UserRegisterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/register")
@RestController
@RequiredArgsConstructor
public class RegisterController {
    private final UserService userService;

    @PostMapping
    public UUID register(@RequestBody UserRegisterDto user) {
        return userService.register(user);
    }
}
