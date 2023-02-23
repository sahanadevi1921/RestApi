package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class Day2 {
	@Value("${greeting.message}")
    private String message;


    @RequestMapping("/msg")
	public String getName(){
        return message;                   
	}
}
