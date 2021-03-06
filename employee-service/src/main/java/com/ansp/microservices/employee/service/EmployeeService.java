package com.ansp.microservices.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ansp.microservices.employee.entities.Employee;
import com.ansp.microservices.employee.exception.EmployeeNotFoundException;
import com.ansp.microservices.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired

	private EmployeeRepository repository;

	public List<Employee> findAll() {

		return (List<Employee>) this.repository.findAll();
	}

	public Employee findById(Integer id) throws Exception {

		return this.repository.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Empleado no existente ")); 
	}

	public Employee save(Employee employee) {

		return this.repository.save(employee);

	}

	public Employee update(Employee employee) {

		return this.repository.save(employee);

	}
	
	public void deleteById(Integer id) {

		 this.repository.deleteById(id);

	}


}