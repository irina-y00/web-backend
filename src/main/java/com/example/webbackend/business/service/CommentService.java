package com.example.webbackend.business.service;

import com.example.webbackend.web.dto.comment.CommentCreateDto;
import com.example.webbackend.web.dto.comment.CommentDto;

public interface CommentService extends DtoCrudService<Long, CommentDto, CommentCreateDto>{
}
