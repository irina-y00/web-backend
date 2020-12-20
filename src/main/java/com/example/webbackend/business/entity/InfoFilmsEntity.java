package com.example.webbackend.business.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity(name = "info_film")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InfoFilmsEntity extends ParentEntity<Long>{

    @Column(name = "date")
    private LocalDate date;

    @Column
    private String budget;

    @ManyToMany
    @JoinTable(name = "info2genre",
            joinColumns = @JoinColumn(name = "info_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"))
   private List<GenreEntity> genre;

    @ManyToMany
    @JoinTable(name = "info2director",
            joinColumns = @JoinColumn(name = "info_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "director_id", referencedColumnName = "id"))
    private List<DirectorEntity> directors;
}
