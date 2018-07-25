package com.shori.TechnologySchool.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.domain.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	//adding a custom method to search student by course id
	
	public  List<Student> findByid(String branch_id);

}
