package com.example.webbackend.business.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity(name = "films")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmEntity extends ModelEntity<Long> {

    private String description;

    @Column(name = "uri_image")
    private String uriImage;

    @OneToMany(mappedBy = "film",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> comments;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "info_id", referencedColumnName = "id")
    private InfoFilmsEntity info;
}
