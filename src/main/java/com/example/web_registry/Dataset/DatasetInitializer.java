package com.example.web_registry.Dataset;

import com.arangodb.springframework.core.ArangoOperations;
import com.example.web_registry.entity.*;
import com.example.web_registry.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.web_registry")
public class DatasetInitializer implements CommandLineRunner{

    @Autowired
    private ArangoOperations operations;

    @Autowired
    private ClinicalVisitDataRepository clinicalVisitDataRepo;

    @Autowired
    private HospitalDetailsRepository hospitalDetailsRepo;
    
    @Autowired
    private ReferredFromRepository refferedFromRepo;

    @Autowired
    private InvestigationsRepository investigationsRepo;

    @Autowired 
    private UndergoesRepository undergoesRepo;

    @Autowired
    private GeneDetailsRepository geneDetailsRepo;

    @Autowired
    private InvestigationGeneRepository investigationGeneRepo;

    @Override
    public void run(String... args) throws Exception {
        operations.dropDatabase();

        final Clinical_Visit_Data patientData = new Clinical_Visit_Data("John", "Lodi", 42);
        patientData.setId("1");
        clinicalVisitDataRepo.save(patientData);
        
        final HospitalDetails referringHospital = new HospitalDetails("Dr. Ibrahim","9.8","Dr. Vishnu", "Dr. Kadam");
        hospitalDetailsRepo.save(referringHospital);

        final ReferredFrom referredFrom = new ReferredFrom(patientData, referringHospital);
        refferedFromRepo.save(referredFrom);

        
        final Investigations investigation = new Investigations("NA","NA", "Na", "NA", "NA", "NA", "NA", "NA","NA");
        investigationsRepo.save(investigation);
        
        final Undergoes patientInvestigation = new Undergoes(patientData, investigation);
        undergoesRepo.save(patientInvestigation);

        final GeneDetails geneDetails = new GeneDetails("sampleGeneName");
        geneDetailsRepo.save(geneDetails);
        
        final InvestigationGene investigationGene = new InvestigationGene(investigation, geneDetails);
        investigationGeneRepo.save(investigationGene);
        
    }
    
}
