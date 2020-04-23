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
import com.forecast.weather.domain.WeatherData;
import com.forecast.weather.repositories.CityRepository;
import com.forecast.weather.services.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
			
	@GetMapping("/current")
	public WeatherData getCurrentMetrics(@RequestParam String cityName,
			                             @RequestParam String countryAcronym) {
 	  
		return weatherService.getCurrentMetrics(cityName,countryAcronym);
 	  
    } 
  
	
	
	
}
