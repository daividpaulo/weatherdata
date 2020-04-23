package com.forecast.weather.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.forecast.weather.domain.City;

@Repository
public interface CityRepository extends GenericRepository<City>{
	
	@Query(value = "select c from City c where c.Capital=true and c.Country = :country ORDER BY c.Name ASC")
	List<City> GetCapitals(@Param("country") String country);
	
}