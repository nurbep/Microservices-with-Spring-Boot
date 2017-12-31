package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

 @FeignClient(name="person-service1")
 @RibbonClient(name="person-service1")

public interface PersonServiceProxy {
	 @GetMapping("/person-service/{firstName}")
		public PersonDetails retrievePerson
			(@PathVariable("firstName") String firstName);
}
