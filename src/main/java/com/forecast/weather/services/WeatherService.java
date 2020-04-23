package com.forecast.weather.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forecast.weather.domain.WeatherData;
import com.forecast.weather.repositories.WeatherDataRepository;


@Service
public class WeatherService {

	@Autowired
	private OpenWeatherService openWeatherService;

	@Autowired
	private WeatherDataRepository weatherDataRepository;
	
	public WeatherData getCurrentMetrics(String cityName, String countryAcronym) {
		
		String location = cityName + ',' + countryAcronym;
		
		try {
			
		  WeatherData weatherData = new WeatherData(openWeatherService.GetCurrentByLocation(location));
		  
		  //weatherDataRepository.save(weatherData);
		  
		  return weatherData;
		  
		} catch (Throwable e) {
		   // retornar mensagens logger
			return null;
		}

	}
	
}
