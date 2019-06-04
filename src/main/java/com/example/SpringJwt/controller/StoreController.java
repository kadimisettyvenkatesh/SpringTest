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

import com.example.SpringJwt.annotation.CustomSecurityAnnotation;
import com.example.SpringJwt.exception.ResourceNotFoundException;
import com.example.SpringJwt.model.Post;
import com.example.SpringJwt.model.Store;
import com.example.SpringJwt.repository.StoreRepository;



@RestController
@RequestMapping("/api")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;
    
    @GetMapping("/stores")
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }
    
    @PostMapping("/store")
    public Store createStore(@Valid @RequestBody Store store) {
        return storeRepository.save(store);
    }
    
    @PutMapping("/store/{storeId}")
    public Store updatePost(@PathVariable Long storeId, @Valid @RequestBody Store postRequest) {
        return storeRepository.findById(storeId).map(store -> {
            return storeRepository.save(postRequest);
        }).orElseThrow(() -> new  ResourceNotFoundException("Store", "id", storeId));
    }


    @DeleteMapping("/store/{storeId}")
    public ResponseEntity<?> deletePost(@PathVariable Long storeId) {
        return storeRepository.findById(storeId).map(store -> {
        	storeRepository.delete(store);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Post","id" ,storeId ));
    }

}