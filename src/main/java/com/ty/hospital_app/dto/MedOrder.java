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

@Entity
public class MedOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medOrdder_Id;
	private double total;
	
	@ManyToOne
	@JoinColumn(name="encounter_Id")
	private Encounter encounter;
	
	@OneToMany(mappedBy = "medOrder", cascade = CascadeType.ALL)
	private List<Item> items;
	
	
	public int getMedOrdder_Id() {
		return medOrdder_Id;
	}
	public void setMedOrdder_Id(int medOrdder_Id) {
		this.medOrdder_Id = medOrdder_Id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "MedOrder [medOrdder_Id=" + medOrdder_Id + ", total=" + total + ", encounter=" + encounter +  "]";
	}
}
