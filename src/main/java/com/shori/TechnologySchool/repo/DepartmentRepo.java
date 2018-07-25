package com.shori.TechnologySchool.repo;

import java.util.List;

import org.hibernate.boot.spi.JpaOrmXmlPersistenceUnitDefaultAware;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
	


}
