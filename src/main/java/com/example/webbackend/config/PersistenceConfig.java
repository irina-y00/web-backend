package com.example.webbackend.config;



import com.example.webbackend.business.entity.UserEntity;
import com.example.webbackend.business.service.UserService;
import com.example.webbackend.utils.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class PersistenceConfig {

    UserService userService;

    public PersistenceConfig(UserService userService){
        this.userService = userService;
    }

    @Bean
    AuditorAware<UserEntity> auditorProvider() {
        return new AuditorAwareImpl(userService);
    }

}
