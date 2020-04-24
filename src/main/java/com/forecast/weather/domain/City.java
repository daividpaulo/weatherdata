package com.forecast.weather.domain;


import javax.persistence.*;


@Entity
@Table(name = "CITIES")
public class City {

	@Id
	private Long IdCity;
	
	private String Name;
	
	private int Ibge;
	
	private String State;
	
	private String Country;
	

	private boolean Capital;

	

	

	public Long getIdCity() {
		return IdCity;
	}

	public void setIdCity(Long idCity) {
		IdCity = idCity;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Capital ? 1231 : 1237);
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + Ibge;
		result = prime * result + ((IdCity == null) ? 0 : IdCity.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (Capital != other.Capital)
			return false;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (Ibge != other.Ibge)
			return false;
		if (IdCity == null) {
			if (other.IdCity != null)
				return false;
		} else if (!IdCity.equals(other.IdCity))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (State == null) {
			if (other.State != null)
				return false;
		} else if (!State.equals(other.State))
			return false;
		return true;
	}


	
	
	
}
