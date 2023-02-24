package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BabyService;

import com.example.demo.model.Baby;



@RestController            
public class BabyController {
	@Autowired
	BabyService service;
	
	@GetMapping("/Baby")
	public List<Baby>  Baby(){
		return service.getBaby();
	}
	@PostMapping("/Baby")
	public String addBaby(@RequestBody Baby baby) {
		service.addBaby(baby);
		return "Added Baby" + baby.getBabyId();
	}
	//sorting
	@GetMapping("/Baby/{field}")
	public List<Baby> BabyWithSort(@PathVariable String field){
		return service.getBabySorted(field);          
	}
	//pagination
	@GetMapping("/Baby/{offset}/{pageSize}")
	public List<Baby> BabyWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return service.getBabyWithPagination(offset,pageSize);
	}
	//sorting and pagination
	@GetMapping("/Baby/{offset}/{pageSize}/{field}")
		public List<Baby> getBabyWithPaginationAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
			return service.getBabyWithPaginationAndSorting(offset, pageSize, field);
		}        
}