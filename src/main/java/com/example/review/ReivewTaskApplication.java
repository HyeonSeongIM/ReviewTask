package com.example.review;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ReivewTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReivewTaskApplication.class, args)
                .getBean(ReivewTaskApplication.class);
    }
}
