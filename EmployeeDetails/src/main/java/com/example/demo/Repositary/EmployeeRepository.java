package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Empolyee;                  

@Repository
public interface EmployeeRepository  extends JpaRepository<Empolyee,Integer>{

}
