package com.example.SpringJwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJwt.model.EmployeeAddress;
import com.example.SpringJwt.repository.EmployeeAddressRepository;


@RestController
@RequestMapping("/api")
public class EmployeeAddressControl {
    @Autowired
    private EmployeeAddressRepository employeeAdddressRepository;
    
    @GetMapping("/employeesAddresses")
    public List<EmployeeAddress> getAllEmpployees() {
        return employeeAdddressRepository.findAll();
    }

}
