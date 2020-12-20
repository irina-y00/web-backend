package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.dao.DirectorRepository;
import com.example.webbackend.business.entity.CommentEntity;
import com.example.webbackend.business.entity.DirectorEntity;
import com.example.webbackend.business.service.DirectorService;
import com.example.webbackend.web.dto.director.DirectorDto;
import com.example.webbackend.web.error.ResourceNotFoundException;
import com.example.webbackend.web.mapper.DirectorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository repository;
    private final DirectorMapper mapper;

    @Override
    public List<DirectorDto> findAllDto() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public Long saveDto(@NotNull DirectorDto dto) {
        return repository.save(mapper.toEntity(dto)).getId();
    }

    @Override
    @Transactional
    public void update(@NotNull DirectorDto dto) {
        DirectorEntity entity = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(dto));
        mapper.updateFromDTO(dto,entity);
    }

    @Override
    public void delete(@NotNull Long id) {
        if (!repository.existsById(id))
            throw new ResourceNotFoundException(id);
        repository.deleteById(id);
    }
}
