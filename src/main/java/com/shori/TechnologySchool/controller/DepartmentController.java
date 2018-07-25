package com.shori.TechnologySchool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.repo.DepartmentRepo;

@RestController
@RequestMapping("/department")

public class DepartmentController {

	@Autowired
	private DepartmentRepo departmentRepo;
	
	@RequestMapping("/findall")
	@ResponseBody
	public List<Department> findall()
	{
		return departmentRepo.findAll();
		
	}
	
	
	@RequestMapping("/{branch_id}")
	@ResponseBody
	public Optional<Department> getDepartmentById(@PathVariable int branch_id)
	{
		
		return departmentRepo.findById(branch_id);
}

	

	// add a dept
	
	@RequestMapping(value = "/adddepartment", method = RequestMethod.POST)
	public void addDepartment(@RequestBody Department department)
	{
		departmentRepo.save(department);
		
	}
	
	
		// delete dept
	
	@RequestMapping(value = "/delete/{dept_id}", method = RequestMethod.DELETE)
	public void deleteDepartment(@PathVariable int dept_id)
	{
		departmentRepo.deleteById(dept_id);
		
	}
}