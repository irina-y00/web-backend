package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.dao.GenreRepository;
import com.example.webbackend.business.entity.GenreEntity;
import com.example.webbackend.business.service.GenreService;
import com.example.webbackend.web.dto.genre.GenreDto;
import com.example.webbackend.web.error.ResourceNotFoundException;
import com.example.webbackend.web.mapper.GenreMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository repository;
    private final GenreMapper mapper;

    @Override
    public List<GenreDto> findAllDto() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public Long saveDto(@NotNull GenreDto dto) {
        return repository.save(mapper.toEntity(dto)).getId();
    }

    @Override
    @Transactional
    public void update(@NotNull GenreDto dto) {
        GenreEntity entity = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(dto));
        mapper.updateFromDTO(dto,entity);
    }

    @Override
    public void delete(@NotNull Long id) {
        GenreEntity entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        repository.delete(entity);
    }
}
