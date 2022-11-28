package com.helloworld.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.helloworld.demoproject.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}






