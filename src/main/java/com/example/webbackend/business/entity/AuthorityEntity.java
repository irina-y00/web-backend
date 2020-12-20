package com.example.webbackend.business.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;

@Entity(name = "authority")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorityEntity extends ModelEntity<Integer> implements GrantedAuthority {

    private String description;

    @Override
    public String getAuthority() {
        return getName();
    }
}