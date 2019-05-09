package com.example.SpringJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJwt.model.Employee;
import com.example.SpringJwt.model.EmployeeAddress;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,Integer> {

}
