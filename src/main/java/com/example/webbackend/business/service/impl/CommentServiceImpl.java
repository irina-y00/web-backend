package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.dao.CommentsRepository;
import com.example.webbackend.business.entity.CommentEntity;
import com.example.webbackend.business.service.CommentService;
import com.example.webbackend.business.service.UserService;
import com.example.webbackend.web.dto.comment.CommentCreateDto;
import com.example.webbackend.web.dto.comment.CommentDto;
import com.example.webbackend.web.error.ResourceNotFoundException;
import com.example.webbackend.web.mapper.CommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentsRepository repository;
    private final CommentMapper mapper;
    private final UserService userService;

    @Override
    public List<CommentDto> findAllDto() {
        return mapper.toReadDTOs(repository.findAll());
    }

    @Override
    public Long saveDto(@NotNull CommentCreateDto dto) {
        CommentEntity commentEntity = mapper.toEntity(dto);
        return repository.saveAndFlush(commentEntity).getId();
    }

    @Override
    @Transactional
    public void update(@NotNull CommentCreateDto dto) {
        CommentEntity entity = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(dto));
        userService.checkResolution(entity.getAuthor().getId());
        mapper.updateFromDTO(dto,entity);
    }

    @Override
    public void delete(@NotNull Long id) {
        CommentEntity entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        userService.checkResolution(entity.getAuthor().getId());
        repository.delete(entity);
    }
}
