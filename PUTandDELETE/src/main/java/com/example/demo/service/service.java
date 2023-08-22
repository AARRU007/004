package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HotelModel;
import com.example.demo.repository.Repository;

@Service

public class service {
	@Autowired
	public Repository hp;
	//post the data
	public HotelModel saveDetails(HotelModel hm) {
		return hp.save(hm);
	
	}
	//get Data
	public List<HotelModel>getDetails(){
		return hp.findAll();
	}
	//update the data
	public HotelModel updateDetails(HotelModel hc) {
		return hp.saveAndFlush(hc);
	}
	//delete the data
	public void deleteDetails(int id) {
		System.out.println("Deleted");
		hp.deleteById(id);
	}
	

}
