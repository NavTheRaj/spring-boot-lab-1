package com.navraj.springbootclass;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.navraj.springbootclass.exceptions.GlobalExceptionHandler;

@SpringBootApplication
public class SpringBootClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootClassApplication.class, args);
    }
}
