package com.example.webbackend.business.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity(name = "authority")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorityEntity extends ModelEntity<Integer> implements GrantedAuthority {

    @Column(name = "date_time_create")
    @CreatedDate
    private LocalDateTime dateTimeCreate;

    @Column(name = "date_time_modif")
    @LastModifiedDate
    private LocalDateTime dateTimeModif;

    private String description;

    @Override
    public String getAuthority() {
        return getName();
    }
}