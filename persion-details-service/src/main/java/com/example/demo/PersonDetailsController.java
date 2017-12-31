package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonDetailsController {
	@Autowired
	private PersonServiceProxy proxy;

	@GetMapping("/person-details-feign/{firstName}")
	public PersonDetails getPersonDetailsFeign(@PathVariable String firstName) {

		PersonDetails response = proxy.retrievePerson(firstName);

		return new PersonDetails(response.getId(), firstName, response.getLastName(),response.getMonthlyIncome(),response.getMonthlyIncome()*12);
	}
}
