package com.example.web_registry.entity;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;

import org.springframework.data.annotation.Id;

@Edge
public class InvestigationGene {
    @Id
    private String id;

    @From
    private Investigations investigation;

    @To
    private GeneDetails geneDetails;

    public InvestigationGene(final Investigations investigation, final GeneDetails geneDetails){
        super();
        this.investigation = investigation;
        this.geneDetails = geneDetails;
    }

	@Override
	public String toString() {
		return "ReferredFrom [id=" + id + ", investigation=" + investigation + ", geneDetails=" + geneDetails + "]";
	}

}
