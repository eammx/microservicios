package com.ansp.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ansp.microservices.entities.Permission;
import com.ansp.microservices.exception.EmployeeNotFoundException;
import com.ansp.microservices.repository.PermissionRepository;

@Service
public class PermissionService {
	@Autowired
	private PermissionRepository repository;
	@Autowired
	private Environment env;
	@Autowired
	private RestTemplate restTemplate;

	public Permission requestPermision(Permission permision) {		 
	    ResponseEntity<Object> resEmployee = this.restTemplate
	    		.getForEntity(env.getProperty("employees.url") 
	    				+ "/" + permision.getEmplooyeeId(), Object.class);
	    if (resEmployee.getStatusCode() == HttpStatus.OK) {         
	    	permision.setStatus("Solicitado");         
	    	this.repository.save(permision);         
	    	return permision;     
	    	}     
	    throw new EmployeeNotFoundException("Empleado no encontrado "); 
	 
	}

}
