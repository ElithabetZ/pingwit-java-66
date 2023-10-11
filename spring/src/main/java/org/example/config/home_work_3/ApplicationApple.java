package org.example.config.home_work_3;

import org.example.config.home_work_3.body.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationApple {

    @Autowired
    private AppleService appleService;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationApple.class, args);
    }
}
