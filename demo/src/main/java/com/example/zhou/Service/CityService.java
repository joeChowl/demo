package com.example.zhou.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zhou.Mapper.CityMapper;
import com.example.zhou.Model.City;

@Service
public class CityService {

	@Autowired
	private CityMapper cityMapper;
	
	public int insertValues(City city) {
		return cityMapper.insert(city);
	}
}
