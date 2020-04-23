package com.forecast.weather.repositories;

import org.springframework.stereotype.Repository;
import com.forecast.weather.domain.WeatherData;

@Repository
public interface WeatherDataRepository extends GenericRepository<WeatherData>{
	
	
}