package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.service.FilmService;
import com.example.webbackend.web.dto.film.FilmCreateDto;
import com.example.webbackend.web.dto.film.FilmReadDto;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {


    @Override
    public List<FilmReadDto> findAllDto() {
        return null;
    }

    @Override
    public Long saveDto(@NotNull FilmCreateDto dto) {
        return null;
    }

    @Override
    public void update(@NotNull FilmCreateDto dto) {

    }

    @Override
    public void delete(@NotNull Long id) {

    }

    @Override
    public FilmReadDto findById(Long id) {
        return null;
    }
}
