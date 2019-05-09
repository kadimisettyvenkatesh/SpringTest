package com.example.SpringJwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJwt.model.Book;
import com.example.SpringJwt.model.Employee;
import com.example.SpringJwt.repository.BookRepository;
import com.example.SpringJwt.repository.EmployeeRepository;


@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmpployees() {
        return employeeRepository.findAll();
    }

}
