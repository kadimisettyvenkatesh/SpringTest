package com.example.SpringJwt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJwt.exception.ResourceNotFoundException;
import com.example.SpringJwt.model.Student;
import com.example.SpringJwt.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    // Get All student
    @GetMapping("/student")
    public List<Student> getAllstudent() {
        return studentRepository.findAll();
    }

    // Create a new Student
    @PostMapping("/student")
    public Student createStudent(@Valid @RequestBody Student student) {
    	System.out.println("Student"+student.getName());
        return studentRepository.save(student);
    }

    // Get a Single Student
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable(value = "id") Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", studentId));
    }



    // Delete a Student
    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", studentId));

        studentRepository.delete(student);

        return ResponseEntity.ok().build();
    }
}
