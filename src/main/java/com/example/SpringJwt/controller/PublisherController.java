package com.example.SpringJwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJwt.annotation.CustomSecurityAnnotation;
import com.example.SpringJwt.model.Book;
import com.example.SpringJwt.model.Publisher;
import com.example.SpringJwt.repository.BookRepository;
import com.example.SpringJwt.repository.PublisherRepository;

@RestController
@RequestMapping("/api")
public class PublisherController {
    @Autowired
    private PublisherRepository publisherRepository;
    
    @CustomSecurityAnnotation(priv=9999)
    @GetMapping("/publishers")
    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

}