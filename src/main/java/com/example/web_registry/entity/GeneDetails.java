package com.example.web_registry.entity;

import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;

import org.springframework.data.annotation.Id;

@Document("Gene_Details")
public class GeneDetails {
    
    @Id
    private String id;

    @ArangoId
    private String arangoId;

    private String genename;

    public GeneDetails(){
        super();
    }   

    public GeneDetails(String genename){
        super();
        this.genename = genename;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArangoId() {
		return arangoId;
	}

	public void setArangoId(String arangoId) {
		this.arangoId = arangoId;
	}

	public String getGenename() {
		return genename;
	}

	public void setGenename(String genename) {
		this.genename = genename;
	}

    

}
