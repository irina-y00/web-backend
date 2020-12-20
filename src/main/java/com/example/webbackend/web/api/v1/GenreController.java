package com.example.webbackend.web.api.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.webbackend.utils.ApiConstant.GENRE;

@RestController
@RequestMapping(GENRE)
@RequiredArgsConstructor
public class GenreController {

}
