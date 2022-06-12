/*package com.test.saas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.saas.model.Welcome;
import com.test.saas.repository.implementation.WelcomeRepositoryImplementation;

@Service
public class WelcomeService {
	
	@Autowired
	WelcomeRepositoryImplementation welcomeRepositoryImplementation;
	
	public List<Welcome> getAllWelcommingMessage() {
		return welcomeRepositoryImplementation.findAll();
	}
	
	
	public Welcome saveNewWelcomeMessage(Welcome welcome) {
		return welcomeRepositoryImplementation.save(welcome);
	}
	
    public Welcome deleteOldWelcomeMessage(Welcome id) {
    	return welcomeRepositoryImplementation.deleteById(id);
    }
	
}

*/
