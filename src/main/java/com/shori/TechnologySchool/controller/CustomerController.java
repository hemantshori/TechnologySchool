package com.shori.TechnologySchool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shori.TechnologySchool.domain.Customer;
import com.shori.TechnologySchool.repo.CustomerRepo;

@RestController
@RequestMapping("/customer")

public class CustomerController {

	@Autowired
	CustomerRepo customerRepo;
	
	@RequestMapping("/findall")
	@ResponseBody
	public List<Customer> findall()
	{
		return customerRepo.findAll();
		
	}
}

		
