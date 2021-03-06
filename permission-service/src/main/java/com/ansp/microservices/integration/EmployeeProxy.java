package com.ansp.microservices.integration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ansp.microservices.pojo.Employee;

@FeignClient(name = "employee-service", url = "http://localhost:8080")
@RibbonClient("employee-service")
public interface EmployeeProxy {
	@GetMapping("/employees/{id}")
	public Employee retrieveEmployee(@PathVariable("id") Integer id);
}
