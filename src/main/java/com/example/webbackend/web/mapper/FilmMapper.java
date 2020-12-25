package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.FilmEntity;
import com.example.webbackend.business.entity.InfoFilmsEntity;
import com.example.webbackend.web.dto.film.FilmCreateDto;
import com.example.webbackend.web.dto.film.FilmReadDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(uses = {GenreMapper.class, DirectorMapper.class})
public abstract class FilmMapper implements GenericReadMapper<FilmReadDto, FilmEntity>, GenericMapper<FilmCreateDto, FilmEntity> {

    @Autowired
    GenreMapper genreMapper;

    @Autowired
    DirectorMapper directorMapper;

    @Mapping(target = "info", source = "dto")
    public abstract FilmEntity toEntity(FilmCreateDto dto);

    @Mapping(target = "info", expression = "java(toEntityInfo(dto))")
    @BeanMapping(nullValuePropertyMappingStrategy = IGNORE)
    public abstract void updateFromDTO(FilmCreateDto dto, @MappingTarget FilmEntity filmEntity);

    @Override
    @Mapping(target = "infoFilm", source = "entity.info")
    public abstract FilmReadDto toReadDTO(FilmEntity entity);

    public InfoFilmsEntity toEntityInfo(FilmCreateDto dto){
        InfoFilmsEntity info = new InfoFilmsEntity();
        info.setBudget(dto.getFilmInfo().getBudget());
        info.setDate(dto.getFilmInfo().getDate());
        info.setGenre(genreMapper.toNewsEntity(dto.getFilmInfo().getGenreIds()));
        info.setDirectors(directorMapper.toNewsEntity(dto.getFilmInfo().getDirectorsId()));
        return info;
    }
}
