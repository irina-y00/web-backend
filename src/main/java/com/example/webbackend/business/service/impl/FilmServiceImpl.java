package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.dao.FilmRepository;
import com.example.webbackend.business.entity.FilmEntity;
import com.example.webbackend.business.service.FilmService;
import com.example.webbackend.web.dto.film.FilmCreateDto;
import com.example.webbackend.web.dto.film.FilmReadDto;
import com.example.webbackend.web.error.ResourceNotFoundException;
import com.example.webbackend.web.mapper.FilmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepository repository;
    private final FilmMapper mapper;

    @Override
    public List<FilmReadDto> findAllDto() {
        return mapper.toReadDTOs(repository.findAll());
    }

    @Override
    public Long saveDto(@NotNull FilmCreateDto dto) {
        return repository.save(mapper.toEntity(dto)).getId();
    }

    @Override
    public void update(@NotNull FilmCreateDto dto) {
        FilmEntity entity = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(dto));
        mapper.updateFromDTO(dto,entity);
    }

    @Override
    public void delete(@NotNull Long id) {
        if (!repository.existsById(id))
            throw new ResourceNotFoundException(id);
        repository.deleteById(id);
    }

    @Override
    public FilmReadDto findById(Long id) {
        return mapper.toReadDTO(repository
                .findById(id)
                .orElseThrow(()-> new  ResourceNotFoundException(id))
        );
    }
}
