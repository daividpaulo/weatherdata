package com.forecast.weather.integrations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import java.util.stream.Collectors;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.forecast.weather.domain.City;
import com.forecast.weather.repositories.CityRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CityIntegrationTests {

	
	@Autowired
    private CityRepository cityRepository;
	
	@Before
	public void setUp() 
	{
		
	}
	
	
	@Test
	public void MustReturnOnlyCapitals(){

		List<City> capitalsCity =  cityRepository.GetCapitals("br");
		
		int qtdNonCapitalsCity = capitalsCity.stream().filter(x-> x.isCapital() == false).collect(Collectors.counting()).intValue();
		
		assertEquals(0, qtdNonCapitalsCity);
	
	}
	
	
	
}
