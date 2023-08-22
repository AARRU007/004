package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HotelModel;

public interface Repository extends JpaRepository<HotelModel, Integer>{
	

}
