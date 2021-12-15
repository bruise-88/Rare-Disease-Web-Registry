package com.example.web_registry.entity;

import java.util.List;

import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Relations;

import org.springframework.data.annotation.Id;

@Document("Clinical_Visit_Data")
public class Clinical_Visit_Data {
    @Id
    private String id;
    
    @ArangoId
    private String arangoId;
    
    private String name;
    private String lastname;
    private Integer age;
    private String dateOfExamination;
    private String dateOfBirth;
    private String provisionalDiagnosis;
    private String gender;
    private String presentingComplaints;
    private String familyHistory;
    private String medicationHistory;
    private String degreeOfConsanguinity;
    private String other;
    
    @Relations(edges=ReferredFrom.class, lazy = true)
    private List<HospitalDetails> referringHospitals;

    @Relations(edges=Undergoes.class, lazy = true)
    private List<Investigations> investigations;

    public List<HospitalDetails> getReferringHospitals() {
        return referringHospitals;
    }

    public void setReferringHospitals(List<HospitalDetails> referringHospitals) {
        this.referringHospitals = referringHospitals;
    }

    public List<Investigations> getInvestigations() {
        return investigations;
    }

    public void setInvestigations(List<Investigations> investigations) {
        this.investigations = investigations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDateOfExamination() {
        return dateOfExamination;
    }

    public String setDateOfExamination(String dateOfExamination) {
        this.dateOfExamination = dateOfExamination;
        return dateOfExamination;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return dateOfBirth;
    }

    public String getProvisionalDiagnosis() {
        return provisionalDiagnosis;
    }

    public String setProvisionalDiagnosis(String provisionalDiagnosis) {
        this.provisionalDiagnosis = provisionalDiagnosis;
        return provisionalDiagnosis;
    }

    public String getGender() {
        return gender;
    }

    public String setGender(String gender){
        this.gender = gender;
        return gender;
    }

    public String getPresentingComplaints()
    {
        return presentingComplaints;
    }

    public String setPresentingComplaints(String presentingComplaints)
    {
        this.presentingComplaints = presentingComplaints;
        return presentingComplaints;
    }

    public String getFamilyHistory()
    {
        return familyHistory;
    }

    public String setFamilyHistory(String familyHistory)
    {
        this.familyHistory = familyHistory;
        return familyHistory;
    }

    public String getMedicationHistory()
    {
        return medicationHistory;
    }

    public String setMedicationHistory(String medicationHistory)
    {
        this.medicationHistory = medicationHistory;
        return medicationHistory;
    }

    public String getDegreeOfConsanguinity()
    {
        return degreeOfConsanguinity;
    }

    public String setDegreeOfConsanguinity(String degreeOfConsanguinity)
    {
        this.degreeOfConsanguinity = degreeOfConsanguinity;
        return degreeOfConsanguinity;
    }

    public String getOther()
    {
        return other;
    }

    public String setOther(String other)
    {
        this.other = other;
        return other;
    }

    public Clinical_Visit_Data(){
        super();
    }

    public Clinical_Visit_Data(final String name, 
                               final String lastname, 
                               final Integer age, 
                               final String dateOfExamination, 
                               final String dateOfBirth, 
                               final String provisionalDiagnosis, 
                               final String gender, 
                               final String presentingComplaints,
                               final String familyHistory,
                               final String medicationHistory,
                               final String degreeOfConsanguinity,
                               final String other) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dateOfExamination = dateOfExamination;
        this.dateOfBirth = dateOfBirth;
        this.provisionalDiagnosis = provisionalDiagnosis;
        this.gender = gender;
        this.presentingComplaints = presentingComplaints;
        this.familyHistory = familyHistory;
        this.medicationHistory = medicationHistory;
        this.degreeOfConsanguinity = degreeOfConsanguinity;
        this.other = other;
    }

	@Override
	public String toString() {
		return "Clinical_Visit_Data [age=" + age + ", arangoId=" + arangoId + ", id=" + id + ", investigations="
				+ investigations + ", lastname=" + lastname + ", name=" + name + ", referringHospitals="
				+ referringHospitals + "]";
	}
    
}
