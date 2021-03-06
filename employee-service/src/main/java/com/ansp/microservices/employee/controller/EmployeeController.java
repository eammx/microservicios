package com.ansp.microservices.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ansp.microservices.employee.entities.Employee;
import com.ansp.microservices.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@ApiOperation("Retorna los empleados")
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return this.service.findAll();
	}
	@ApiOperation("Guarda un empleado")
	@PostMapping("/employees")
	public Employee save(@Valid @RequestBody Employee employee) {
		return this.service.save(employee);
	}
	@ApiOperation("Actualiza un empleado")
	@PutMapping("/employees/{id}")
	public Employee update(@RequestBody Employee employee, @PathVariable("id") Integer id) {
		employee.setId(id);
		return this.service.update(employee);
	}
	@ApiOperation("Retorna un empleado")
	@GetMapping("/employees/{id}")
	public Employee findById(@PathVariable("id") Integer id) throws Exception {
		return this.service.findById(id);
	}
	@ApiOperation("Borra un empleado")
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable("id") Integer id) {
		this.service.deleteById(id);
	}
}
