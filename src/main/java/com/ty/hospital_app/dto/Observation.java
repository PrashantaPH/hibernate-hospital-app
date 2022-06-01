package com.ty.hospital_app.dto;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int observation_Id;
	private LocalDateTime dateTime;
	private String status;
	private String remark;
	
	@ManyToOne
	@JoinColumn(name = "encounter_id")
	private Encounter encounter;
	
	public int getObservation_Id() {
		return observation_Id;
	}
	public void setObservation_Id(int observation_Id) {
		this.observation_Id = observation_Id;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Observation [observation_Id=" + observation_Id + ", dateTime=" + dateTime + ", status=" + status
				+ ", remark=" + remark + "]";
	}
}
