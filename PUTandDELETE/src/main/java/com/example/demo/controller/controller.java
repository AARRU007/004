package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.service;
import com.example.demo.model.HotelModel;

@RestController

public class controller {
	@Autowired
	public service mm;
	@PostMapping("/postHotel")
	public String HotelModel(@RequestBody HotelModel h) {
		
		return "mm.saveDetails(h);";
	}
	
	@GetMapping("/gethotel")
	public List<HotelModel>getrithick(){
		return mm.getDetails();
	}
	@PutMapping("/updatehotel")
	public HotelModel updaterithick(@RequestBody HotelModel ha) {
		return mm.updateDetails(ha);
	}
	//delete by path variable
	@DeleteMapping("/deletehotel/{id}")
	public String removerithick(@PathVariable("id") int hid) {
		mm.deleteDetails(hid);
		return "Hotel with Id"+hid+"is deleted";
	}
	//delete mapping using request parm
	@DeleteMapping("/byrepparm")
	public String removedRequestParm(@RequestParam("id") int id) {
		mm.deleteDetails(id);
		return "Hotel with Id "+id+" is deleted";
	}
	
		

}