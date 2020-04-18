package com.forecast.weather.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forecast.weather.domain.City;
import com.forecast.weather.repositories.CityRepository;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private CityRepository cityRepository;
	

	@GetMapping
	public List<City> get() {
 		return cityRepository.findAll();
    }
	
	
	@GetMapping("/capitals")
	public List<City> getCapitals(@RequestParam String countryAcronym) {
 	  return cityRepository.GetCapitals(countryAcronym);
    } 
  
	
	
}
