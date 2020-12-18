package com.example.webbackend.business.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity(name = "genre")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenreEntity extends ModelEntity<Long> {
    @ManyToMany(mappedBy = "genre")
    private List<InfoFilmsEntity> info;
}
