package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student zamar = new Student(
                    "Zamar",
                    "zerll9100@gmail.com",
                    LocalDate.of(1990, Month.JANUARY, 30)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1989, Month.JANUARY, 30)
            );

            repository.saveAll(
                    List.of(zamar, alex)
            );
        };
    }
}
