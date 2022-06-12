package com.test.saas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.saas.model.Welcome;
import com.test.saas.repository.WelcomeRepository;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeRepository repository;
	
	@GetMapping("/")
	ResponseEntity<List<Welcome>> welcome() {
		List<Welcome> welcome = repository.findAll();
	    return new ResponseEntity<List<Welcome>>(welcome, HttpStatus.OK);
	}
	
}

