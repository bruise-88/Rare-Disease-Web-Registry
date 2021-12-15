package com.example.web_registry.entity;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;

import org.springframework.data.annotation.Id;

@Edge
public class Undergoes {
    @Id
    private String id;

    @From
    private Clinical_Visit_Data patient;

    @To
    private Investigations investigation;

    public Undergoes(final Clinical_Visit_Data patient, final Investigations investigation){
        super();
        this.patient = patient;
        this.investigation = investigation;
    }

	@Override
	public String toString() {
		return "Undergoes [id=" + id + ", patient=" + patient + ", investigation=" + investigation + "]";
	}

}
