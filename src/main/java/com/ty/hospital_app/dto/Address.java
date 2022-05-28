package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int address_Id;
	private String street; 
	private String state;
	private String counrty;
	private int pincode;
	private Branch branch;
	
	public int getAddress_Id() {
		return address_Id;
	}
	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCounrty() {
		return counrty;
	}
	public void setCounrty(String counrty) {
		this.counrty = counrty;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
}
