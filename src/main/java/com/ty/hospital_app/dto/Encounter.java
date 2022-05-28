package com.ty.hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Person person;
	private Branch branch;
	private List< MedOrder> medOrders;
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
}
