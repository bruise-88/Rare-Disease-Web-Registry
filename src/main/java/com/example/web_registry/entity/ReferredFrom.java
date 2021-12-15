package com.example.web_registry.entity;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;

import org.springframework.data.annotation.Id;

@Edge
public class ReferredFrom {
    @Id
    private String id;

    @From
    private Clinical_Visit_Data patient;

    @To
    private HospitalDetails referringHospital;

    public ReferredFrom(final Clinical_Visit_Data patient, final HospitalDetails referringHospital){
        super();
        this.patient = patient;
        this.referringHospital = referringHospital;
    }

	@Override
	public String toString() {
		return "ReferredFrom [id=" + id + ", patient=" + patient + ", referringHospital=" + referringHospital + "]";
	}

}
