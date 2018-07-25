package com.shori.TechnologySchool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Service
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int batch;
	private String name;
	private String category;
	private String student_branch;
	
	
	
	
	
	
	public Student() {
		super();
	}
	public Student(int id, int batch, String name, String category, String student_branch) {
		super();
		this.id = id;
		this.batch = batch;
		this.name = name;
		this.category = category;
		this.student_branch= student_branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStudent_branch() {
		return student_branch;
	}
	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}
	
	
	
}
