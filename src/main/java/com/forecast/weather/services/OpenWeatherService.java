package com.forecast.weather.services;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;



@Service
public class OpenWeatherService  {
	
	  public OpenWeatherService() {}
	

	  private String baseAPI = "http://api.openweathermap.org/data/2.5/weather?q=";
	  private String forecastAPI = "http://api.openweathermap.org/data/2.5/forecast?";
	  private String oncallAPI = "https://api.openweathermap.org/data/2.5/onecall?";

	  
	  private String apiKey = "2d7c3fa1e95007571247471203db3d31";
	  
	
	  public  JSONObject GetForecastByIdCity(Long idCityOpenWeather)  throws Throwable {
		  String Url = forecastAPI + "id=" + idCityOpenWeather + "&appid=" + apiKey;
		  return ExecuteAndGetResponseJson(Url);
	  }
	  
	  
	  public  JSONObject GetOnCallByLatLon(float lat,float lon)  throws Throwable {
		  String Url = oncallAPI + "lat=" + lat + "&lon=" + lon + "&units=metric&appid=" + apiKey ;
		  return ExecuteAndGetResponseJson(Url);
  	  }
	
	  public  JSONObject GetCurrentByLocation(String location) throws Throwable  {
		  String Url = baseAPI + URLEncoder.encode(location, "utf-8") + "&units=metric&appid=" + apiKey ;
		  return ExecuteAndGetResponseJson(Url);
  	  }
	  
	  
	 private JSONObject ExecuteAndGetResponseJson(String urlForRequest) throws JSONException, ClientProtocolException, IOException  {
		
		  HttpClient client = HttpClientBuilder.create().build();    
		  
		  HttpResponse response = client.execute(new HttpGet(urlForRequest)); 
		  
		  String content = EntityUtils.toString(response.getEntity());
	
		  return new JSONObject(content);
	 }

}


