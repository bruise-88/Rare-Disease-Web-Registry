package com.example.web_registry.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.web_registry.entity.*;
import com.example.web_registry.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService{

    @Autowired
    private ClinicalVisitDataRepository clinicalVisitDataRepo;

    @Autowired
    private InvestigationsRepository investigationsRepo;


    public List<Clinical_Visit_Data> geneNameQuery(String geneName) throws Exception {
        
        List<Investigations> investigations =  (List<Investigations>) investigationsRepo.findByGenesGenename(geneName);
        
        List<Clinical_Visit_Data> patients = new ArrayList<Clinical_Visit_Data>();

        for(Investigations investigationT : investigations){
            List<Clinical_Visit_Data> tempPatients = (List<Clinical_Visit_Data>) clinicalVisitDataRepo.findAllByInvestigationsId(investigationT.getId());
            patients.addAll(tempPatients);
        }

        return patients;

    }

    public Optional<Clinical_Visit_Data> patientIdQuery(String patientID){
        return clinicalVisitDataRepo.findById(patientID);
    }
    
}
