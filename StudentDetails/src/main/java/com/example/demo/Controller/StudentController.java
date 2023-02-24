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

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/stud")
	public boolean Addstudent(@RequestBody Student stud) {
		return service.Addstudent(stud);
	}
	@GetMapping("/stud")
	public List<Student> read(){
		return service.getStudent();
	}
	@GetMapping("/stud{id}")
	public Optional<Student> readById(@PathVariable int id){
		return service.getStudentById(id);
	}
	@PutMapping("/stud")
	public String update(@RequestBody Student stud) {
		return service.updateStudent(stud);
	}
	@DeleteMapping("/stud/{id}")
	public boolean delete(@PathVariable int id) {
		return service.deleteStudentById(id);
	}
}