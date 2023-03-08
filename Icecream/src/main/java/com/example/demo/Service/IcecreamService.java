package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.IcecreamRepository;
import com.example.demo.model.Icecream;

@Service
public class IcecreamService {
	@Autowired
	IcecreamRepository repository;
	
	public String addIcecream(Icecream ice) {
		repository.save(ice);
		return "Added";                  
	}                        
	public List<Icecream> getIcecream() {
		return repository.findAll();              
	}
	public Optional<Icecream> getIcecreamById(int id){
		return repository.findById(id);          
	}
	public String updateIcecream(Icecream ice) {
		repository.save(ice);                         
		return "Updated";
	}
	public String deleteIcecreamById(int id) {
		repository.deleteById(id);
		return " Deleted";
	}
}