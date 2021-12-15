package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.InvestigationGene;

public interface InvestigationGeneRepository extends ArangoRepository<InvestigationGene, String>{
    
}
