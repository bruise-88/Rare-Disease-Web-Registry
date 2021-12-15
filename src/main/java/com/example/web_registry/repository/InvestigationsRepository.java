package com.example.web_registry.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.example.web_registry.entity.Investigations;

public interface InvestigationsRepository extends ArangoRepository<Investigations, String>{

    Iterable<Investigations> findByGenesGenename(String genename);
}