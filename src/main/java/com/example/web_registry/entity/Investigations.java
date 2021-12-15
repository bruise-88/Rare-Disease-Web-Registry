package com.example.web_registry.entity;

import java.util.List;

import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Relations;

import org.springframework.data.annotation.Id;

@Document("Investiagations")
public class Investigations {
    
    @Id
    private String id;

    @ArangoId
    private String arangoID;

    private String cbc;
    private String lft, rft;
    private String ammonia;
    private String lactate;
    private String cpk;
    private String gcms;
    private String msms;
    private String otherInvestigations;

    @Relations(edges = InvestigationGene.class, lazy = true)
    private List<GeneDetails> genes;
 
    
	public Investigations(String cbc, String lft, String rft, String ammonia, String lactate, String cpk, String gcms,
			String msms, String otherInvestigations) {
		this.cbc = cbc;
		this.lft = lft;
		this.rft = rft;
		this.ammonia = ammonia;
		this.lactate = lactate;
		this.cpk = cpk;
		this.gcms = gcms;
		this.msms = msms;
		this.otherInvestigations = otherInvestigations;
	}

    public Investigations(){
        super();
    }

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArangoID() {
		return arangoID;
	}
	public void setArangoID(String arangoID) {
		this.arangoID = arangoID;
	}
	public String getCbc() {
		return cbc;
	}
	public void setCbc(String cbc) {
		this.cbc = cbc;
	}
	public String getLft() {
		return lft;
	}
	public void setLft(String lft) {
		this.lft = lft;
	}
	public String getRft() {
		return rft;
	}
	public void setRft(String rft) {
		this.rft = rft;
	}
	public String getAmmonia() {
		return ammonia;
	}
	public void setAmmonia(String ammonia) {
		this.ammonia = ammonia;
	}
	public String getLactate() {
		return lactate;
	}
	public void setLactate(String lactate) {
		this.lactate = lactate;
	}
	public String getCpk() {
		return cpk;
	}
	public void setCpk(String cpk) {
		this.cpk = cpk;
	}
	public String getGcms() {
		return gcms;
	}
	public void setGcms(String gcms) {
		this.gcms = gcms;
	}
	public String getMsms() {
		return msms;
	}
	public void setMsms(String msms) {
		this.msms = msms;
	}
	public String getOtherInvestigations() {
		return otherInvestigations;
	}
	public void setOtherInvestigations(String otherInvestigations) {
		this.otherInvestigations = otherInvestigations;
	}

	@Override
	public String toString() {
		return "Investigations [ammonia=" + ammonia + ", arangoID=" + arangoID + ", cbc=" + cbc + ", cpk=" + cpk
				+ ", gcms=" + gcms + ", genes=" + genes + ", id=" + id + ", lactate=" + lactate + ", lft="
				+ lft + ", msms=" + msms + ", otherInvestigations=" + otherInvestigations + ", rft=" + rft + "]";
	}
	
    

    

}
