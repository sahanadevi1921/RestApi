package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CarRepository;
import com.example.demo.model.Car;

@Service
public class CarService {
	
	@Autowired
	CarRepository repo;
	public boolean postCar(Car car) {
		repo.save(car);
		return true;
	}

	public List<Car> getCarsByOwners(int owners) {
		return repo.findByOwners(owners);
	}

	public List<Car> getCarByAddress(String address) {
		return repo.findByAddress(address);
	}

	public List<Car> getCarByCarName(String carname) {
		return repo.findByCarName(carname);
	}

	public List<Car> getCarByOwnersAndCarType(int owners, String cartype) {
		return repo.findByOwnersAndCarType(owners, cartype);
	}

}