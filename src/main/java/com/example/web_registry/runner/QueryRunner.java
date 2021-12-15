package com.example.web_registry.runner;

import com.example.web_registry.Services.QueryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.web_registry")
public class QueryRunner implements CommandLineRunner{

    @Autowired
    private QueryService qs;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Found Patients By Gene Name: " + qs.geneNameQuery("sampleGeneName"));
        System.out.println();
        System.out.println();
        System.out.println("Found Patients By Patient Id: " + qs.patientIdQuery("1"));
    }
    
}
