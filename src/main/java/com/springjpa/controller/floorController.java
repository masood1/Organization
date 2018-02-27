package com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.repo.FloorRepository;

@RestController
@RequestMapping(value = "floor") 
public class floorController {
	@Autowired
	FloorRepository floorRep;
	
	
	
}
