package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branch_Id;
	private String name;
	private long phone;
	private String email;

	@OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
	private Address address;

	@ManyToOne
	@JoinColumn(name = "hospital_Id")
	private Hospital hospital;

	@OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
	private List<Encounter> encounters;

	public int getBranch_Id() {
		return branch_Id;
	}

	public void setBranch_Id(int branch_Id) {
		this.branch_Id = branch_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public List<Encounter> getEncounters() {
		return encounters;
	}

	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}

//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}

	@Override
	public String toString() {
		return "Branch [branch_Id=" + branch_Id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}
