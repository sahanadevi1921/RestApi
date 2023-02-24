package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Empolyee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/Empolyee")
	public boolean addEmpolyee(@RequestBody Empolyee Empolyee) {
		return service.addEmpolyee(Empolyee);     
	}
	@GetMapping("/Empolyee")
	public List<Empolyee> read(){
		return service.getEmpolyee();                            
	}
	@GetMapping("/Empolyee{id}")
	public Optional<Empolyee> readById(@PathVariable int id){
		return service.getEmpolyeeById(id);
	}
}
