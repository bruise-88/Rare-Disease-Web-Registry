package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.ReferredFrom;

public interface ReferredFromRepository extends ArangoRepository<ReferredFrom, String>{
    
}