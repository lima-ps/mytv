package com.phill.mytv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.phill.mytv")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
