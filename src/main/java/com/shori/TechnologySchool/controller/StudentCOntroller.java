package com.shori.TechnologySchool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.domain.Student;
import com.shori.TechnologySchool.repo.DepartmentRepo;
import com.shori.TechnologySchool.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentCOntroller {
	@Autowired
		private StudentRepo studentRepo;
		
		@RequestMapping(value = "/branch/{branch_id}/findallstudents", method = RequestMethod.GET)
		@ResponseBody
		public List<Student> findall(@PathVariable String branch_id)
		{
			return studentRepo.findByid(branch_id);
			
			
		}
		
		
		@RequestMapping(value ="/branch/{branch_id}/students/{student_id}", method = RequestMethod.GET)
		@ResponseBody
		public Optional<Student> getStudentById(@PathVariable int student_id)
		{
			
			return studentRepo.findById(student_id);
			
	}

		

		// add a student
		
		@RequestMapping(value = "/branch/{branch_id}/students", method = RequestMethod.POST)
		public void addStudent(@RequestBody Student student, @PathVariable String branch_id)
		{
			student.setDepartment(new Department());
			studentRepo.save(student);
			
		}
		
		
			// delete student
		
		@RequestMapping(value = "/branch/{branch_id}/delete/{student_id}", method = RequestMethod.DELETE)
		public void deleteStudent(@PathVariable int student_id)
		{
			studentRepo.deleteById(student_id);
			
		}
	}


