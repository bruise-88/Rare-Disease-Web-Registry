package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.GeneDetails;

public interface GeneDetailsRepository extends ArangoRepository<GeneDetails, String>{
    
    public GeneDetails findByGenename(String genename);

}
