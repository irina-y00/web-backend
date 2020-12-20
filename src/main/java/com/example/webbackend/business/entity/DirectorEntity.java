package com.example.webbackend.business.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity(name = "director")
@AllArgsConstructor
@NoArgsConstructor
public class DirectorEntity extends ModelEntity<Long>{
    @ManyToMany(mappedBy = "directors")
    private List<InfoFilmsEntity> info;
}
