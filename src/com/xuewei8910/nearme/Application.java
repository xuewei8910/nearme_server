package com.xuewei8910.nearme;

import com.xuewei8910.nearme.repository.EventRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Wei on 2014/10/16.
 */
@EnableAutoConfiguration
@EnableWebMvc
@Configuration
@ComponentScan
public class Application extends RepositoryRestMvcAutoConfiguration{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
