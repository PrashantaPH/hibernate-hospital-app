package com.ty.hospital_app.dto;

import java.time.LocalDateTime;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int encounter_Id;
	private LocalDateTime adminDateTime;
	private LocalDateTime dischargeDateTime;
	private String reason;
	
	@ManyToOne
	@JoinColumn(name = "person_Id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name ="branch_Id")
	private Branch branch;
	
	@OneToMany(mappedBy = "encounter", cascade = CascadeType.ALL)
	private List< MedOrder> medOrders;
	
	@OneToMany(mappedBy = "encounter", cascade = CascadeType.ALL)
	private List<Observation> observations;
	
	public int getEncounter_Id() {
		return encounter_Id;
	}
	public void setEncounter_Id(int encounter_Id) {
		this.encounter_Id = encounter_Id;
	}
	public LocalDateTime getAdminDateTime() {
		return adminDateTime;
	}
	public void setAdminDateTime(LocalDateTime adminDateTime) {
		this.adminDateTime = adminDateTime;
	}
	public LocalDateTime getDischargeDateTime() {
		return dischargeDateTime;
	}
	public void setDischargeDateTime(LocalDateTime dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<MedOrder> getMedOrders() {
		return medOrders;
	}
	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
	@Override
	public String toString() {
		return "Encounter [encounter_Id=" + encounter_Id + ", adminDateTime=" + adminDateTime + ", dischargeDateTime="
				+ dischargeDateTime + ", reason=" + reason +  "]";
	}
}
