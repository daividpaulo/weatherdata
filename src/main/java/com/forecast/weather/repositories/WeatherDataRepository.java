package com.forecast.weather.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.forecast.weather.domain.WeatherData;

@Repository
public interface WeatherDataRepository extends GenericRepository<WeatherData>{

	
	@Query(value = "SELECT W FROM WeatherData W JOIN W.City C WHERE TO_CHAR(W.Data,'dd/MM/yyyy') =TO_CHAR( Now(),'dd/MM/yyyy') and  C.IdCity = :idCity ORDER BY  W.Data ASC ")
	List<WeatherData> getHourlyToday(@Param("idCity") Long idCity);
	
	
}