package com.example.zhou.Controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zhou.Model.City;
import com.example.zhou.Service.CityService;

@RequestMapping("/city")
@RestController
public class CityController {
	
	@Resource
	private CityService cityService;
	
	@GetMapping("/insertValues")
	public void insertValues() {
		City city = new City();
		city.setCityCode("123456");
		city.setCityName("广东");
		city.setId(1);
		cityService.insertValues(city);
	}
}
