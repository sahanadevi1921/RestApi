package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Repository.BusRepository;
import com.example.demo.model.Bus;

@Service
public class BusService {
	@Autowired
	BusRepository repository;
	
	public String addBus(Bus bus) {
		repository.save(bus);
		return "Added";
	}
	public List<Bus> getBus() {
		return repository.findAll();              
	}
	public Optional<Bus> getBusById(int id){
		return repository.findById(id);          
	}
	public String updateBus(Bus bus) {
		repository.save(bus);
		return "Updated";
	}
	public String deleteBusById(int id) {
		repository.deleteById(id);
		return "Bus deleted";
	}
	//sorting
	public List<Bus> getBusSorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	//pagination
	public List<Bus> getBusWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		Page<Bus> page=repository.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	//sorting and pagination
	public List<Bus> getBusWithPaginationAndSorting(int offset,  int pageSize, String field){
		Page<Bus> page=repository.findAll(PageRequest.of(offset, pageSize,Sort.by(field)));
		return page.getContent();               
		}

}                  

