package com.example.SpringJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJwt.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
