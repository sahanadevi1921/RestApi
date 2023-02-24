package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Baby;
import com.example.demo.repository.BabyRepository;



@Service
public class BabyService {
	@Autowired
	BabyRepository repository;
	public String addBaby(Baby Baby) {
		repository.save(Baby);
		return "Added";
	}
	public List<Baby> getBaby(){
		return repository.findAll();
	}
	//sorting
	public List<Baby> getBabySorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	//pagination
	public List<Baby> getBabyWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		Page<Baby> page=repository.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	//sorting and pagination
	public List<Baby> getBabyWithPaginationAndSorting(int offset, int pageSize,String field){
		Page<Baby> page=repository.findAll(PageRequest.of(offset, pageSize,Sort.by(field)));
		return page.getContent();
	}

}


                         