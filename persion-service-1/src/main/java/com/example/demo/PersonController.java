package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/person-service/{firstName}")
	public Person getPerson(@PathVariable("firstName") String firstName)
	{
		return personRepository.findByFirstName(firstName);
	}
	
	

}
