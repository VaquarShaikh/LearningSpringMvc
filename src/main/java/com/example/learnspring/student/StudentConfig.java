package com.example.learnspring.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
             Student vaqy = new Student(
                    "vaqy",
                    LocalDate.of(2000 , 07 , 13 ),
                    "vaqy@gmail.com"

            );

            Student maa = new Student(
                    "maa",
                    LocalDate.of(2000 , 01 , 31 ),
                    "maa@gmail.com"

            );

            repository.saveAll(
                    List.of(vaqy , maa)
            );
        };
    }
}
