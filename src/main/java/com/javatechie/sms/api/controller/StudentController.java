package com.javatechie.sms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.sms.api.entity.Student;
import com.javatechie.sms.api.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	//TODO implement CRUD operations
	
	@Autowired
	private StudentService service;

	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student save = service.save(student);
		
		return new ResponseEntity<> (save, HttpStatus.CREATED);
	}
}
