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
    
    @Relations(edges=ReferredFrom.class, lazy = true)
    private List<HospitalDetails> referringHospitals;

    @Relations(edges=Undergoes.class, lazy = true)
    private List<Investigations> investigations;

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


    public Clinical_Visit_Data(){
        super();
    }

    public Clinical_Visit_Data(final String name, final String lastname, final Integer age) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

	@Override
	public String toString() {
		return "Clinical_Visit_Data [age=" + age + ", arangoId=" + arangoId + ", id=" + id + ", investigations="
				+ investigations + ", lastname=" + lastname + ", name=" + name + ", referringHospitals="
				+ referringHospitals + "]";
	}
    
}
