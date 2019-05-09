package com.example.SpringJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJwt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}