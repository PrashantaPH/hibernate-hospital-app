package com.ty.hospital_app.dto;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_Id; 
	private String name;
	private int quantity;
	private double cost;
	
	@ManyToOne
	@JoinColumn(name = "medOrder_Id")
	private MedOrder medOrder;
	
	public int getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}
	public MedOrder getMedOrder() {
		return medOrder;
	}
	public void setMedOrder(MedOrder medOrder) {
		this.medOrder = medOrder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [item_Id=" + item_Id + ", name=" + name + ", quantity=" + quantity + ", cost=" + cost
				 + "]";
	}
}
