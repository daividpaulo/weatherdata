package com.forecast.weather.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.json.JSONObject;

@Entity
@IdClass(WeatherDataId.class)
@Table(name = "WEATHER_DATA")
public class WeatherData {

@Id 
private Date Data;
   
@Id
private int  IdCityApi;
   
private  String  NameCity;
private	 int     CloudsPercent;
private  String  WeatherDescription;
private  String  WeatherIcon;
private  Double  Temp;
private	 Double  TempMin;
private	 Double	 TempMax;
private	 Double	 Pressure;
private	 Double	 Humidity;
private	 Double	 SpeedWind;
   
public WeatherData(JSONObject weatherApiData) {
	this.Data = new Date(weatherApiData.getLong("dt") * 1000);
	this.IdCityApi = weatherApiData.getInt("id");
	this.NameCity = weatherApiData.getString("name");
	this.CloudsPercent = weatherApiData.getJSONObject("clouds").getInt("all");
	
	JSONObject weatherObject = (JSONObject) weatherApiData.getJSONArray("weather").get(0);
	
	this.WeatherDescription = weatherObject.getString("description");
	this.WeatherIcon = weatherObject.getString("icon");
	
	this.Temp = weatherApiData.getJSONObject("main").getDouble("temp");
	this.TempMin= weatherApiData.getJSONObject("main").getDouble("temp_min");
	this.TempMax= weatherApiData.getJSONObject("main").getDouble("temp_max");
	this.Pressure= weatherApiData.getJSONObject("main").getDouble("pressure");
	this.Humidity= weatherApiData.getJSONObject("main").getDouble("humidity");
	this.SpeedWind= weatherApiData.getJSONObject("wind").getDouble("speed");
}

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
public String getNameCity() {
	return NameCity;
}
public void setNameCity(String nameCity) {
	NameCity = nameCity;
}
public int getCloudsPercent() {
	return CloudsPercent;
}
public void setCloudsPercent(int cloudsPercent) {
	CloudsPercent = cloudsPercent;
}
public String getWeatherDescription() {
	return WeatherDescription;
}
public void setWeatherDescription(String weatherDescription) {
	WeatherDescription = weatherDescription;
}
public String getWeatherIcon() {
	return WeatherIcon;
}
public void setWeatherIcon(String weatherIcon) {
	WeatherIcon = weatherIcon;
}
public Double getTemp() {
	return Temp;
}
public void setTemp(Double temp) {
	Temp = temp;
}
public Double getTempMin() {
	return TempMin;
}
public void setTempMin(Double tempMin) {
	TempMin = tempMin;
}
public Double getTempMax() {
	return TempMax;
}
public void setTempMax(Double tempMax) {
	TempMax = tempMax;
}
public Double getPressure() {
	return Pressure;
}
public void setPressure(Double pressure) {
	Pressure = pressure;
}
public Double getHumidity() {
	return Humidity;
}
public void setHumidity(Double humidity) {
	Humidity = humidity;
}
public Double getSpeedWind() {
	return SpeedWind;
}
public void setSpeedWind(Double speedWind) {
	SpeedWind = speedWind;
}

	
	
}
