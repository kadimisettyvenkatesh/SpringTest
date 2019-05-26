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
import com.example.SpringJwt.model.Product;
import com.example.SpringJwt.model.Store;
import com.example.SpringJwt.repository.ProductRepository;



@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    @PostMapping("/product")
    public Product createStore(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }
    
    @PutMapping("/product/{productId}")
    public Product updatePost(@PathVariable Long productId, @Valid @RequestBody Product productRequest) {
        return productRepository.findById(productId).map(product -> {
            return productRepository.save(productRequest);
        }).orElseThrow(() -> new  ResourceNotFoundException("Product", "id", productId));
    }


    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deletePost(@PathVariable Long productId) {
        return productRepository.findById(productId).map(product -> {
        	productRepository.delete(product);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Product","id" ,productId ));
    }

}