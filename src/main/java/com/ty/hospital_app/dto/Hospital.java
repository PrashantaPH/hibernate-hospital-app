package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospital_Id;
	private String name; 
	private String website;
	
	@OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
	private List<Branch> branchs;
	
	public int getHospital_Id() {
		return hospital_Id;
	}
	public void setHospital_Id(int hospital_Id) {
		this.hospital_Id = hospital_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<Branch> getBranchs() {
		return branchs;
	}
	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}
	@Override
	public String toString() {
		System.out.println("Hospital Id : "+hospital_Id);
		System.out.println("Hospital Name : "+name);
		System.out.println("Hospital WebSite : "+website);
		return "";
	}
}
