package com.ansp.microservices.permission;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ansp.microservices.entities.Permission;
import com.ansp.microservices.integration.EmployeeProxy;
import com.ansp.microservices.services.PermissionService;

@SpringBootTest
class PermissionServiceApplicationTests {
	@Autowired
	PermissionService service;
	@Autowired
	EmployeeProxy  proxy; 

	
	//@Test
	void resquestPermisionTest() {
		Permission p = new Permission();
		p.setDate(LocalDateTime.now());
		p.setEmplooyeeId(1);
		p.setReason("balanceo del lado del cliente ");
		this.service.requestPermision(p);
	}

	@Test
	void proxy() {
		this.proxy.retrieveEmployee(1);
	}

}
