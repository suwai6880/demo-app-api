package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
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
            Student mariam= new Student(
                    "Mariam",
                    "mariam123@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,20)
            );
            Student alex= new Student(
                    "Alex",
                    "alex123@gmail.com",
                    LocalDate.of(1999, Month.JANUARY,20)
            );

            repository.saveAll(
                    List.of(mariam,alex)
        );

        };

    }
}
