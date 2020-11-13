package com.example.demo.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stud;
import com.example.demo.repository.Repository;

@RestController
@RequestMapping("/api")

public class Controller {
@Autowired
private Repository repository;

@GetMapping("/get")
public List<Stud> getAll(){
	
	return  repository.findAll();
}
@GetMapping("/getstudroll")
public Stud findBystudroll(@RequestParam (value="studroll", required=true)String studroll)
{
	return  repository.findBystudroll(studroll);
	
}


@PostMapping("/post")
public Stud student(@RequestBody Stud student)
{
	return repository.save(student) ;

	
	}
	
}



