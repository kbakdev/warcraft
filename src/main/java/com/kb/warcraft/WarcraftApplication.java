package com.kb.warcraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan("com.kb.warcraft.domain")
@SpringBootApplication

public class WarcraftApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WarcraftApplication.class, args);
    }

}
