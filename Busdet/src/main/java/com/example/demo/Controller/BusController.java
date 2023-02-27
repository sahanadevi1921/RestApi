package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BusService;
import com.example.demo.model.Bus;



@RestController 
public class BusController {
	@Autowired
	BusService service;
	
	@PostMapping("/bus")
	public String addBus(@RequestBody Bus bus) {
		return service.addBus(bus);            
	}
	@GetMapping("/bus")
	public List<Bus> read(){
		return service.getBus();                            
	}
	@GetMapping("/bus{id}")
	public Optional<Bus> readById(@PathVariable int id){
		return service.getBusById(id);
	}
	@PutMapping("/bus")
	public String update(@RequestBody Bus bus) {
		return service.updateBus(bus);
	}
	@DeleteMapping("/bus/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteBusById(id);
	}
	//sorting
	@GetMapping("/bus/{field}")                                                               
	public List<Bus> busWithSort(@PathVariable String field){
		return service.getBusSorted(field);                     
	}
	//pagination
	@GetMapping("/bus/{offset}/{pageSize}")
	public List<Bus> BusWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return service.getBusWithPagination(offset,pageSize);                        
	}
	//sorting and pagination
	@GetMapping("/bus/{offset}/{pageSize}/{field}")
	public List<Bus> getBusWithPaginationAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
		return service.getBusWithPaginationAndSorting(offset, pageSize, field);
	}   

}                               

