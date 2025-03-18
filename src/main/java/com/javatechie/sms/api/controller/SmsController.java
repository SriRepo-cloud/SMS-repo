package com.javatechie.sms.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsController {
	
	@GetMapping("/msg")
	public ResponseEntity<String> message(){
		
		return new ResponseEntity<>("Hi, good morning!! this is first git demo message", HttpStatus.ACCEPTED);
	}

}
