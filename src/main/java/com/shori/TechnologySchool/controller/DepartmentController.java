package com.shori.TechnologySchool.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		
		Optional<Department> dep =  departmentRepo.findById(branch_id);
	
		if(dep.isPresent())
		{
			return dep;
			
		}else{
			System.out.println("#########" +dep);	
			throw new UserNotFoundException("branch not found"+branch_id);
		}
		
		
}

	

	// add a dept
	
	@RequestMapping(value = "/adddepartment", method = RequestMethod.POST)
	public ResponseEntity<Object> addDepartment(@RequestBody Department department)
	{
		departmentRepo.save(department);
		URI location = ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/dept_id")
		.buildAndExpand(department.getDept_id())
		.toUri();
		
		return ResponseEntity.created(location).build();
		
		//return departmentRepo.save(department);
		
	}
	
	
		// delete dept
	
	@RequestMapping(value = "/delete/{dept_id}", method = RequestMethod.DELETE)
	public void deleteDepartment(@PathVariable int dept_id)
	{
		departmentRepo.deleteById(dept_id);
		
	}
}