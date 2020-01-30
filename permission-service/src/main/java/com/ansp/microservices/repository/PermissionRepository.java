package com.ansp.microservices.repository;

import com.ansp.microservices.entities.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermissionRepository extends MongoRepository<Permission, String>{

}
