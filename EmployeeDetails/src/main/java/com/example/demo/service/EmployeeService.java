package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;        

import com.example.demo.Repositary.EmployeeRepository;
import com.example.demo.model.Empolyee;



@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;             
	public boolean addEmpolyee(Empolyee Empolyee) {          
		repository.save(Empolyee);
		return true;
	}
	public List<Empolyee> getEmpolyee() {
		return repository.findAll();              
	}
	public Optional<Empolyee> getEmpolyeeById(int id){
		return repository.findById(id);
	}

}
