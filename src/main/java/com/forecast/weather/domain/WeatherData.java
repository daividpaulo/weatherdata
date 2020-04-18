package com.forecast.weather.domain;

import java.util.Calendar;

import lombok.Data;

@Data
public class WeatherData {


	private Calendar DataFrom; 
	
	private City City;
	
  	private float Temperature;
  	
	private float MinTemperature;
	
	private float MaxTemperature;
	
	private float Humidity;
	
	private String  Weather;
	
	private String  WeatherDescription;
	
	private float SpeedWind;
	
	
}
