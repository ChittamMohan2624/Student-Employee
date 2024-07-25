package com.chittamtech.Student_Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableJpaRepositories

public class StudentEmployeeApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentEmployeeApplication.class, args);
    }

}
