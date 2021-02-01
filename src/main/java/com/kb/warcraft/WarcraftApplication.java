package com.kb.warcraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.kb.warcraft.domain", "com.kb.warcraft.repositories"})
public class WarcraftApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WarcraftApplication.class, args);
    }

}
