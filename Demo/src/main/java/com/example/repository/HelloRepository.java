package com.example.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Hello;

public interface HelloRepository extends JpaRepository<Hello, Integer> {
}
