package com.example.SpringJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringJwt.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
