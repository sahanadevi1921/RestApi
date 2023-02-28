package com.example.demo.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Empolyee;                  

@Repository
public interface EmployeeRepository  extends JpaRepository<Empolyee,Integer>{
	boolean existById(int primaryKey);
	public List<Empolyee> findByName(String name);    
	public List<Empolyee> findByStatus (String status);
	public List<Empolyee> findByIdAndName(int id,String name);
	public List<Empolyee> findByIdorName(int id,String name);
	public List<Empolyee> findByNameAndStatus(String name,String status);
	public List<Empolyee> findByNameStartingWith(String start);
	public List<Empolyee> findByNameEndingWith(String end);
	

}
