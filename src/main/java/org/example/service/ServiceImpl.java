package org.example.service;

// StartupRunner.java
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.example.entities.Address;
import org.example.entities.Laptop;
import org.example.entities.Student;
import org.example.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Slf4j

@Component
public class ServiceImpl {

    @Autowired
    private StudentRepo repository;

    @PostConstruct
    public void runAfterStartup() {
//        Student student = new Student();
//        student.setStudentName("Aron Finch");
//        student.setStudentId(102);
//        student.setAbout("Captain of Australian cricket team");
//
//        Laptop laptop = new Laptop();
//        laptop.setLaptopId(201);
//        laptop.setBrand("Apple Mac");
//        laptop.setModelNumber("Mac-M3 Pro");
//        laptop.setStudent(student);
//        student.setLaptop(laptop);
//
//        repository.save(student);
//        log.info("Student saved Successfully");

        // ONE TO MANY

        Student student = new Student();
        student.setStudentName("Kirat Sharma");
        student.setStudentId(103);
        student.setAbout("Full Stack Developer");

        Address a1 = new Address();
        a1.setAddressId(11);
        a1.setCity("Patna");
        a1.setStreet("boring road");
        a1.setState("Bihar");
        a1.setStudent(student);

        Address a2 = new Address();
        a2.setAddressId(13);
        a2.setCity("Nalanda");
        a2.setStreet("hilsa");
        a2.setState("Bihar");
        a2.setStudent(student);

        Address a3 = new Address();
        a3.setAddressId(16);
        a3.setCity("Gaya");
        a3.setStreet("line road");
        a3.setState("Bihar");
        a3.setStudent(student);

       List<Address> addressList1 = new ArrayList<>();
        addressList1.add(a1);
        addressList1.add(a2);
        addressList1.add(a3);


        student.setAddressList(addressList1);
        Student save = repository.save(student);
        log.info("ONE TO MANY Implemented");

    }
}

