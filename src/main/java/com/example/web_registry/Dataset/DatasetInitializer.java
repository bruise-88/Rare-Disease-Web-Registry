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

        String[][] patients =  {
            {"John", "Bailey", "42","2021-04-15", "1990-11-01", "cough", "male","sore throat, coughing","none","","0",""},
            {"Jane", "Austin","31", "2021-04-15", "1990-11-01", "cough", "female","sore throat, coughing","none","","0",""},
            {"Ryan","Murphy","20","2020-03-04","2000-01-02","myopia", "male","blurry vision", "present in the paternal line","eye lubricants taken","","0",""},
            {"Noah","Reynolds","25","2020-06-14","1996-04-12","covid-19","male", "difficulty in breating, fever", "none","none","","0",""},
            {"Mathew","Beck","21","2021-11-04","2000-08-30","black fungus","male", "pain in eyes, nose and jaw", "none","steroids taken","","0",""},
            {"Rebecca","Charles","27","2021-02-01","1994-09-22","oral cavity", "female","severe tooth ache", "none","none","painkillers","0",""},
            {"Jessie","Hetz","40","2020-12-14","1981-05-27","cancer", "female","knots behind neck, blood during coughing", "present in the maternal line","none","","0",""},
            {"Karen","Whitter","62","2019-07-17","1959-07-16","athritis", "female", "knee pain, inflamation", "none","none","","0",""},
        };

        String[][] doctors = {
            {"Dr. Ibrahim","9.8","Dr. Vishnu", "Dr. Kadam"},
            {"Dr. Patel","9.8","Dr. Reddington", "Dr. Vickers"},
            {"Dr. Rose","9.8","Dr. Moses", "Dr. Rahul"},
            {"Dr. Katherine","9.8","Dr. Clay", "Dr. Tony"},
            {"Dr. Justin","9.8","Dr. Jessica", "Dr. Bryce"},
            {"Dr. Archie","9.8","Dr. Veronica", "Dr. Betty"},
            {"Dr. Rose","9.8","Dr. Moses", "Dr. Rahul"},
            {"Dr. Ibrahim","9.8","Dr. Vishnu", "Dr. Kadam"},
        };

        String[][] investigations = {
            {"3.4", "5.3", "218", "12.4", "52.5", "0.0001", "2.4","155","none"},
            {"4.1", "7.7", "179", "15.2", "58.2", "0.0012", "4.7","341","none"},
            {"3.9", "6.9", "213", "13.5", "45.7", "0.0008", "6.5","231","none"},
            {"3.5", "7.9", "209", "11.6", "47.5", "0.0014", "8.2","144","none"},
            {"4.4", "9.1", "301", "16.2", "49.2", "0.0051", "13.3","290","none"},
            {"5.1", "6.7", "199", "15.2", "58.6", "0.0012", "4.7","341","none"},
            {"3.9", "8.9", "213", "10.1", "48.2", "0.0018", "9.5","201","none"},
            {"5.3", "5.9", "308", "11.1", "46.7", "0.0010", "7.5","131","none"},
        };

        String[] genes = {
            "ERCC1",
            "BCL2",
            "ATM",
            "ERCC1",
            "MT-CO1",
            "PLCG1",
            "ATM",
            "SDHA"
        };

        for(int i=0; i < patients.length ;++i)
        {
            String[] patient = patients[i];
            final Clinical_Visit_Data patientData = new Clinical_Visit_Data(patient[0], patient[1], Integer.parseInt(patient[2]), patient[3], patient[4], patient[5], patient[6], patient[7], patient[8], patient[9], patient[10], patient[11]);
            patientData.setId(patient[0]);
            clinicalVisitDataRepo.save(patientData);

            String[] doctor = doctors[i];
            final HospitalDetails referringHospital = new HospitalDetails(doctor[0], doctor[1], doctor[2], doctor[3]);
            hospitalDetailsRepo.save(referringHospital);

            final ReferredFrom refferedFrom = new ReferredFrom(patientData, referringHospital);
            refferedFromRepo.save(refferedFrom);
            
            String[] investigationData = investigations[i];
            final Investigations investigation = new Investigations(investigationData[0], investigationData[1], investigationData[2], investigationData[3], investigationData[4], investigationData[5], investigationData[6], investigationData[7], investigationData[8]);
            investigationsRepo.save(investigation);

            final Undergoes patientInvestigation = new Undergoes(patientData, investigation);
            undergoesRepo.save(patientInvestigation);

            String gene = genes[i];
            final GeneDetails geneDetails = new GeneDetails(gene);
            geneDetailsRepo.save(geneDetails);

            final InvestigationGene investigationGene = new InvestigationGene(investigation, geneDetails);
            investigationGeneRepo.save(investigationGene);
        }
        
    }
    
}
