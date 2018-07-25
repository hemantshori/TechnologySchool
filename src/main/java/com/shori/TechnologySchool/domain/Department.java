package com.shori.TechnologySchool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;
@Service
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branch_id;
	private String dept_name;

	
	public Department() {
		super();
	}

	public Department(int branch_id, String dept_name) {
		super();
		this.branch_id = branch_id;
		this.dept_name = dept_name;
	}

	public int getDept_id() {
		return branch_id;
	}

	public void setDept_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}
