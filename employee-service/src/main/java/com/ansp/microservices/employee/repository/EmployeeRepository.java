package com.ansp.microservices.employee.repository;

import org.springframework.stereotype.Repository;

import com.ansp.microservices.employee.entities.*;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
