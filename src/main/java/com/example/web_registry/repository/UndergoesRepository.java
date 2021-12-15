package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.Undergoes;

public interface UndergoesRepository extends ArangoRepository<Undergoes, String>{
    
}