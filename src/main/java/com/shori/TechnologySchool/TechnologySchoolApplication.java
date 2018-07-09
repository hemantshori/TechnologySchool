package com.shori.TechnologySchool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TechnologySchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnologySchoolApplication.class, args);
	}
	
	@Autowired
	@RequestMapping(value = "/login", method = RequestMethod.GET)

	public String loginPage() {
System.out.println("HElklllloooooooooooooooooooooooooooooooooooooooo");
		return "Login";
	}
}
