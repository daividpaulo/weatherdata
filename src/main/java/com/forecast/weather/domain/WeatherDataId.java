package com.forecast.weather.domain;

import java.io.Serializable;
import java.util.Date;



public class WeatherDataId implements Serializable{

	   
	
	private static final long serialVersionUID = 1L;

	private Date Data;
	   
	private int  IdCityApi;

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public int getIdCityApi() {
		return IdCityApi;
	}

	public void setIdCityApi(int idCityApi) {
		IdCityApi = idCityApi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Data == null) ? 0 : Data.hashCode());
		result = prime * result + IdCityApi;
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
		WeatherDataId other = (WeatherDataId) obj;
		if (Data == null) {
			if (other.Data != null)
				return false;
		} else if (!Data.equals(other.Data))
			return false;
		if (IdCityApi != other.IdCityApi)
			return false;
		return true;
	}

	
	   
	   
}
