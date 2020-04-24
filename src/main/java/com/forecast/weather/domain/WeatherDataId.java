package com.forecast.weather.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class WeatherDataId implements Serializable{

	
	private Date Data;
	
	private Long City;

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public Long getCity() {
		return City;
	}

	public void setCity(Long city) {
		City = city;
	}

	
	
	
	   
	   
}
