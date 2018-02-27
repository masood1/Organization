package com.springjpa.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.Building;
import com.springjpa.model.Desk;
import com.springjpa.model.Floor;
import com.springjpa.repo.BuildingRepository;
import com.springjpa.repo.DeskRepository;
import com.springjpa.repo.FloorRepository;

import org.json.*;

@RestController
@RequestMapping(value = "/cisco")
public class WebController {
	@Autowired
	BuildingRepository buildingRep;
	@Autowired
	FloorRepository floorRep;
	@Autowired
	DeskRepository deskRep;

	@RequestMapping(value = "/{model}/{id}", method = { RequestMethod.DELETE })
	@ResponseBody
	String delete(@PathVariable long id, @PathVariable String model) {
		System.out.println("ID : " + id);
		String message = "";
		if (model.isEmpty()) {
			return "Empty model please give fallowing 1=building 2=floor 3=desk " + id;
		}

		if (model.equals("building")) {

			if (buildingRep.exists(id)) {
				buildingRep.delete(id);
				message = "Building deleted " + id;
			} else {
				message = "Building ID Doesnot exist";
			}

		} else if (model.equals("floor")) {
			
			if (floorRep.exists(id)) {
				floorRep.delete(id);
				message = "Floor deleted " + id;
			} else {
				message = "Floor ID Doesnot exist";
			}
		
		} else if (model.equals("desk")) {

			if (deskRep.exists(id)) {
				deskRep.delete(id);
				message = "Desk deleted " + id;
			} else {
				message = "Desk ID Doesnot exist";
			}


		} else {

			message = "Wrong model please give fallowing 1=building 2=floor 3=desk " + id;
		}

		return message;

	}


	@RequestMapping(value = "/{model}/{id}", method = { RequestMethod.GET })
	@ResponseBody
	String get(@PathVariable long id, @PathVariable String model) {
		System.out.println("ID : " + id);
		String message = "";
		if (model.isEmpty()) {
			return "Empty model please give fallowing 1=building 2=floor 3=desk " + id;
		}

		if (model.equals("building")) {

			if (buildingRep.exists(id)) {
				Building b = buildingRep.findOne(id);
				message = b.toString();
			} else {
				message = "Building ID Doesnot exist";
			}

		} else if (model.equals("floor")) {
			
			if (floorRep.exists(id)) {
				Floor f =floorRep.findOne(id);
				message = f.toString();
			} else {
				message = "Floor ID Doesnot exist";
			}
		
		} else if (model.equals("desk")) {

			if (deskRep.exists(id)) {
				Desk d = deskRep.findOne(id);
				message = d.toString();
			} else {
				message = "Desk ID Doesnot exist";
			}


		} else {

			message = "Wrong model please give fallowing 1=building 2=floor 3=desk " + id;
		}

		return message;

	}

	
	@RequestMapping(value = "building", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody
	String post(Model model, @Valid @ModelAttribute("Building") Building building, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Wrong data");
			return "Null values or worng data please check properly Number = " + result.getErrorCount() + " \n Error : "
					+ result.getAllErrors();
		} else {

			buildingRep.save(building);
			return "Succesfull";
		}
	}

	@RequestMapping(method = RequestMethod.PUT)
	String put() {
		return "Hello from put";
	}


	@RequestMapping(value = "/demoValues")
	public String process() {
		String result = "";
		buildingRep.save(new Building(123545, "B1", 6));
		floorRep.save(new Floor(12311, 150, 1, 123545));
		deskRep.save(new Desk(9663991, "masood", "388470", 1, 123545));

		for (Floor flr : floorRep.findAll()) {
			result += flr.toString() + "<br>";
		}

		for (Building bld : buildingRep.findAll()) {
			result += bld.toString() + "<br>";
		}

		for (Desk dk : deskRep.findAll()) {
			result += dk.toString() + "<br>";
		}
		return result;
	}

}
