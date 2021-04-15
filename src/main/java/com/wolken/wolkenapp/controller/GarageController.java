package com.wolken.wolkenapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.DTO.VehicleDTO;
@RestController
@RequestMapping("/")
public class GarageController {
	VehicleDTO dto = new VehicleDTO();

	public GarageController() {
		dto.setId(1);
		dto.setType("bike");
		dto.setColor("black");
		dto.setNoOfWheels(2);
	} 
	@GetMapping("/getAll")
	public VehicleDTO getAll() {
		return dto;
		
	}
	@PostMapping("/save")
	public String save(@RequestBody VehicleDTO dto){
		return "data saved"+ dto.getType();
		
		}
	@PutMapping("/update")
	public String update(@RequestBody VehicleDTO dto) {
		return "data updated"+dto.getType();
		
	}
	@DeleteMapping("/delete")
	public String delete(@RequestBody VehicleDTO dto) {
		return "deleted"+dto.getType();
		
	}
		}

