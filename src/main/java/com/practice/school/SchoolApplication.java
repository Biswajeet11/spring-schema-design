package com.practice.school;

import com.practice.school.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        BaseModel model = new BaseModel();
        model.getId();
//        model.setId();
        SpringApplication.run(SchoolApplication.class, args);
    }

}
