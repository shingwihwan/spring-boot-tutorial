package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Zamar",
                        "zerll9100@gmail.com",
                        LocalDate.of(1989, Month.DECEMBER, 30),
                        30
                )
        );
    }
}
