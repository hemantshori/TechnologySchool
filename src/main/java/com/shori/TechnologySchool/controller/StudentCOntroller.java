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
		
		@RequestMapping(value = "/findall", method = RequestMethod.GET)
		@ResponseBody
		public List<Student> findall()
		{
			//return studentRepo.findAll();
			return studentRepo.findAll();
			
		}
		
		
		@RequestMapping(value ="/{student_id}", method = RequestMethod.GET)
		@ResponseBody
		public Optional<Student> getStudentById(@PathVariable int dept_id)
		{
			
			return studentRepo.findById(dept_id);
	}

		

		// add a student
		
		@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
		public void addStudent(@RequestBody Student student)
		{
			studentRepo.save(student);
			
		}
		
		
			// delete student
		
		@RequestMapping(value = "/delete/{student_id}", method = RequestMethod.DELETE)
		public void deleteStudent(@PathVariable int student_id)
		{
			studentRepo.deleteById(student_id);
			
		}
	}


