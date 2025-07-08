package org.example.service;

// StartupRunner.java
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.example.entities.*;
import org.example.repo.CategoryRepo;
import org.example.repo.ProductRepo;
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

    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;

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
//
//        Student student = new Student();
//        student.setStudentName("Kirat Sharma");
//        student.setStudentId(103);
//        student.setAbout("Full Stack Developer");
//
//        Address a1 = new Address();
//        a1.setAddressId(11);
//        a1.setCity("Patna");
//        a1.setStreet("boring road");
//        a1.setState("Bihar");
//        a1.setStudent(student);
//
//        Address a2 = new Address();
//        a2.setAddressId(13);
//        a2.setCity("Nalanda");
//        a2.setStreet("hilsa");
//        a2.setState("Bihar");
//        a2.setStudent(student);
//
//        Address a3 = new Address();
//        a3.setAddressId(16);
//        a3.setCity("Gaya");
//        a3.setStreet("line road");
//        a3.setState("Bihar");
//        a3.setStudent(student);
//
//       List<Address> addressList1 = new ArrayList<>();
//        addressList1.add(a1);
//        addressList1.add(a2);
//        addressList1.add(a3);
//
//
//        student.setAddressList(addressList1);
//        Student save = repository.save(student);
//        log.info("ONE TO MANY Implemented");

        // MANY TO MANY
        Product p1 = new Product();
        p1.setPId("303");
        p1.setPName("Mobile");

        Product p2 = new Product();
        p2.setPId("304");
        p2.setPName("Electronics");

        productRepo.save(p1);
        productRepo.save(p2);

        List<Product> category1Product = new ArrayList<>();
        category1Product.add(p1);
        category1Product.add(p2);

        List<Product> category2Product = new ArrayList<>();
        category2Product.add(p1);
        category2Product.add(p2);

        Category c1 = new Category();
        c1.setCId("555");
        c1.setCName("Samsung");
        c1.setProducts(category1Product);

        Category c2 = new Category();
        c2.setCId("666");
        c2.setCName("IPhone");
        c2.setProducts(category2Product);

        categoryRepo.save(c1);
        categoryRepo.save(c2);
        log.info("MANY TO MANY Implemented");
    }
}

