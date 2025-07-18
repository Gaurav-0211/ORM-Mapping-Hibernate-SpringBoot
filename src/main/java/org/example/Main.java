package org.example;

import org.example.entities.Laptop;
import org.example.entities.Student;
import org.example.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Main.class, args);
    }
}