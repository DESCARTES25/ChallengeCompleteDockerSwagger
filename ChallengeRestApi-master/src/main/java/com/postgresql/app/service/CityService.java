package com.postgresql.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.postgresql.app.exceptions.NoCitiesFoundException;
import com.postgresql.app.model.City;
import com.postgresql.app.repository.CityRepository;


@Service
@Qualifier("com.postgresql.app.service.CityService")
public class CityService implements ICityService {

	@Autowired
	private CityRepository cityRepository;
	

	
	@Override
	public List<City> findAll() {
		
		List<City> cities = (List<City>) cityRepository.findAll();

		if (cities.isEmpty()) {

			throw new NoCitiesFoundException();
		}

		return cities;

	}

}