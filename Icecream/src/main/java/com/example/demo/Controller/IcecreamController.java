package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IcecreamService;
import com.example.demo.model.Icecream;

@RestController
public class IcecreamController {
	@Autowired
	IcecreamService service;
	
	@PostMapping("/ice")
	@CrossOrigin
	public String addIcecream(@RequestBody Icecream ice) {
		return service.addIcecream(ice);                                  
	}
	@GetMapping("/ice")
	@CrossOrigin
	public List<Icecream> read(){
		return service.getIcecream();                            
	}
	@GetMapping("/ice{id}")
	@CrossOrigin
	public Optional<Icecream> readById(@PathVariable int id){
		return service.getIcecreamById(id);
	}
	@PutMapping("/ice")
	@CrossOrigin
	public String update(@RequestBody Icecream ice) {
		return service.updateIcecream(ice);
	}
	@DeleteMapping("/ice/{id}")
	@CrossOrigin
	public String delete(@PathVariable int id) {
		return service.deleteIcecreamById(id);
	}
}
