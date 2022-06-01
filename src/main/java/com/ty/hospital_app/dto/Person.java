package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int person_id;
	private String name; 
	private String email;
	private long phone;
	
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<Encounter>  encounter;
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public List<Encounter> getEncounters() {
		return encounter;
	}
	public void setEncounters(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", phone=" + phone
				 + "]";
	}
	
}
