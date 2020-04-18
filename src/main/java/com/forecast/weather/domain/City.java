package com.forecast.weather.domain;


import javax.persistence.*;


@Entity
@Table(name = "CITIES")
public class City {

	@Id
	private int Id;
	
	private String Name;
	
	private int Ibge;
	
	private String State;
	
	private String Country;
	

	private boolean Capital;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getIbge() {
		return Ibge;
	}

	public void setIbge(int ibge) {
		Ibge = ibge;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public boolean isCapital() {
		return Capital;
	}

	public void setCapital(boolean capital) {
		Capital = capital;
	}


	
	
	
}
