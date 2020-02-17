package com.ansp.microservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.ansp.microservices.entities.Permission;

public interface PermissionRepository extends CrudRepository<Permission, String>{

}
