package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.HospitalDetails;

public interface HospitalDetailsRepository extends ArangoRepository<HospitalDetails, String>{
    
}