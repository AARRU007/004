package com.example.demo.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bookmodel;

public interface repository extends JpaRepository<bookmodel, Integer> {

}
