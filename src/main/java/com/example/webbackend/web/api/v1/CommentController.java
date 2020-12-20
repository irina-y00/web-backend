package com.example.webbackend.web.api.v1;


import com.example.webbackend.business.service.CommentService;
import com.example.webbackend.web.dto.comment.CommentCreateDto;
import com.example.webbackend.web.dto.comment.CommentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.webbackend.utils.ApiConstant.COMMENTS;

@RestController
@RequestMapping(COMMENTS)
@RequiredArgsConstructor
public class CommentController {
    private final CommentService service;


    @GetMapping
    public List<CommentDto> getAll(){
        return service.findAllDto();
    }

    @PostMapping
    public Long save(@RequestBody CommentCreateDto dto){
        return service.saveDto(dto);
    }

    @PutMapping
    public void update(@RequestBody CommentCreateDto dto) { service.update(dto);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){service.delete(id);}
}
