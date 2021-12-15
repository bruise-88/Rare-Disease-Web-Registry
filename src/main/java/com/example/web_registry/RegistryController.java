package com.example.web_registry;

import java.util.List;
import java.util.Optional;

import com.example.web_registry.Services.QueryService;
import com.example.web_registry.entity.Clinical_Visit_Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistryController {
    
    @Autowired
    private QueryService qs;

    @GetMapping("/patientquery")
    Clinical_Visit_Data getPatientData(@RequestParam(defaultValue = "1",required = true) String id){
        Optional<Clinical_Visit_Data> patientDataOpt = qs.patientIdQuery(id);
        Clinical_Visit_Data patientData;
        if(patientDataOpt.isPresent()){
            patientData = patientDataOpt.get();
            return patientData;
        }else{
            return null;
        }
    }

    @GetMapping("/genequery")
    List<Clinical_Visit_Data> getPatientsForGene(@RequestParam(required = true) String genename) throws Exception{
        return qs.geneNameQuery(genename);
    }

}
