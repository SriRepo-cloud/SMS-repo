package com.javatechie.sms.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.sms.api.entity.Student;
import com.javatechie.sms.api.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student save(Student student) {
		return repository.save(student);
	}

}
