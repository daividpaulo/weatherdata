package com.forecast.weather.integrations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.forecast.weather.services.OpenWeatherService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenWeatherServiceTests {

	@Autowired
	private OpenWeatherService openWeatherService; 
	
	
	@Before
	public void setUp() 
	{	
	}
	
	
	@Test
	public void MustReturnJsonCorreto() throws Throwable{
  	    JSONObject jsonResult = openWeatherService.GetCurrentByLocation("Caruaru");
		assertEquals("Caruaru", jsonResult.get("name"));
	}
	
	
	
}
