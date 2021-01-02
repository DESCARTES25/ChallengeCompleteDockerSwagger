package com.postgresql.app.service;

import java.util.List;

import com.postgresql.app.model.City;

public interface ICityService {
	

	  
	  //Return all the cities in DB
	  List<City> findAll();
	  
	
}
