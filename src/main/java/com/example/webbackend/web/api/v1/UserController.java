package com.example.webbackend.web.api.v1;


import com.example.webbackend.business.service.UserService;
import com.example.webbackend.web.dto.user.UserDto;
import com.example.webbackend.web.dto.user.UserUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

import static com.example.webbackend.utils.ApiConstant.USER;

@RequestMapping(USER)
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable UUID userId) {
        userService.delete(userId);
    }

    @GetMapping("/{userId}")
    public UserDto get(@PathVariable UUID userId) {
        return userService.findDtoById(userId);
    }

    @GetMapping
    public List<UserDto> getAll() {
        return userService.findAllDto();
    }

    @PutMapping
    public void update(@Valid @RequestBody UserUpdateDto userDto) {
        userService.update(userDto);
    }
}
