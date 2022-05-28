package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderDao {

	public MedOrder saveMedOrderDao(int encounter_id, MedOrder medOrder);

	public MedOrder getmMedOrder(int medOrder_Id);

	public List<MedOrder> getAllMedOrders(int encounter_id);

	public MedOrder updateMedOrder(int medOrder_Id, MedOrder medOrder);

	public boolean deleteMedOrder(int medOrder_Id);
}
