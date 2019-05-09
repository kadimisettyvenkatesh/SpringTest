package com.example.SpringJwt.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}