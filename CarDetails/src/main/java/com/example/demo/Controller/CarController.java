package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CarService;
import com.example.demo.model.Car;

@RestController
public class CarController {
	@Autowired
	CarService service;
	
	@PostMapping("/car")
	public boolean postCar(@RequestBody Car car) {
		return service.postCar(car);
	}
	
	@GetMapping("/owners/{owners}")
	public List<Car> getCarByOwners(@PathVariable int owners){
		return service.getCarsByOwners(owners);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getCarByAddress(@PathVariable String address){
		return service.getCarByAddress(address);
	}
	
	@GetMapping("/carname/{carname}")
	public List<Car> getCarByCarName(@PathVariable String carname){
		return service.getCarByCarName(carname);
	}
	
	@GetMapping("/owners/{owners}/cartype/{cartype}")
	public List<Car> getCarByOwnersAndCarType(@PathVariable int owners, @PathVariable String cartype){
		return service.getCarByOwnersAndCarType(owners,cartype);
	}
}