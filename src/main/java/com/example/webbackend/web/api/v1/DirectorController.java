package com.example.webbackend.web.api.v1;

import com.example.webbackend.business.service.DirectorService;
import com.example.webbackend.web.dto.director.DirectorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.webbackend.utils.ApiConstant.DIRECTOR;

@RestController
@RequestMapping(DIRECTOR)
@RequiredArgsConstructor
public class DirectorController {
    private final DirectorService service;

    @PostMapping
    public Long save(@RequestBody DirectorDto dto){
        return service.saveDto(dto);
    }

    @PutMapping
    public void update(@RequestBody DirectorDto dto) { service.update(dto);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){service.delete(id);}

    @GetMapping
    public List<DirectorDto> getAll(){
        return service.findAllDto();
    }
}
