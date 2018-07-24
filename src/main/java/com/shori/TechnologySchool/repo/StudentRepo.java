package com.shori.TechnologySchool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.domain.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
