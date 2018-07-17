package com.shori.TechnologySchool.repo;

import org.hibernate.boot.spi.JpaOrmXmlPersistenceUnitDefaultAware;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
