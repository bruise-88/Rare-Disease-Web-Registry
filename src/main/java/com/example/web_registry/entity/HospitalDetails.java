package com.example.web_registry.entity;


import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;

import org.springframework.data.annotation.Id;

@Document("Hospital_Details")
public class HospitalDetails {
    @Id
    private String id;

    @ArangoId
    private String arangoID;
    
    private String referring_clinician;
	private String hospital_of_referring_ph;
    private String clinician_incharge;
    private String counselor;
    

    public HospitalDetails(String referring_clinician, String hospital_of_referring_ph,
			String clinician_incharge, String counselor) {
		this.referring_clinician = referring_clinician;
		this.hospital_of_referring_ph = hospital_of_referring_ph;
		this.clinician_incharge = clinician_incharge;
		this.counselor = counselor;
	}
	public String getId() {
        return id;
	}
	public void setId(String id) {
        this.id = id;
	}
    public String getReferring_clinician() {
        return referring_clinician;
    }
    public void setReferring_clinician(String referring_clinician) {
        this.referring_clinician = referring_clinician;
    }
	public String getArangoID() {
		return arangoID;
	}
	public void setArangoID(String arangoID) {
		this.arangoID = arangoID;
	}
	public String getHospital_of_referring_ph() {
		return hospital_of_referring_ph;
	}
	public void setHospital_of_referring_ph(String hospital_of_referring_ph) {
		this.hospital_of_referring_ph = hospital_of_referring_ph;
	}
	public String getClinician_incharge() {
		return clinician_incharge;
	}
	public void setClinician_incharge(String clinician_incharge) {
		this.clinician_incharge = clinician_incharge;
	}
	public String getCounselor() {
		return counselor;
	}
	public void setCounselor(String counselor) {
        this.counselor = counselor;
	}
    
    @Override
	public String toString() {
		return "HospitalDetails [arangoID=" + arangoID + ", clinician_incharge=" + clinician_incharge + ", counselor="
				+ counselor + ", hospital_of_referring_ph="
				+ hospital_of_referring_ph + ", id=" + id + ", referring_clinician=" + referring_clinician + "]";
	}
}
