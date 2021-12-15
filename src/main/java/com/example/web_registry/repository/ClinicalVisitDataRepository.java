package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.Clinical_Visit_Data;

public interface ClinicalVisitDataRepository extends ArangoRepository<Clinical_Visit_Data, String>{
 
    Iterable<Clinical_Visit_Data> findAllByInvestigationsId(String id);
    
}
