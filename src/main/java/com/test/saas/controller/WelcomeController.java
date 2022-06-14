package com.test.saas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.saas.model.Welcome;
import com.test.saas.repository.WelcomeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}, allowedHeaders = "*", allowCredentials = "true")
public class WelcomeController {
	
	@Autowired
	WelcomeRepository repository;
	
	@GetMapping("/")
	ResponseEntity<List<Welcome>> welcome() {
		List<Welcome> welcome = repository.findAll();
	    return new ResponseEntity<List<Welcome>>(welcome, HttpStatus.OK);
	}
	
    @PostMapping("/save-welcome")
    public ResponseEntity<Welcome> saveWelcome(@RequestBody Welcome message) {
        Welcome save = repository.save(message);
        return ResponseEntity.ok(save);
    }

	
}

