package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.MedOrderDaoImpl;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.MedOrderService;

public class MedOrderServiceImpl implements MedOrderService {

	MedOrderDaoImpl impl = new MedOrderDaoImpl();

	@Override
	public MedOrder saveMedOrderDao(int encounter_id, MedOrder medOrder) {
		return impl.saveMedOrderDao(encounter_id, medOrder);
	}

	@Override
	public MedOrder getmMedOrder(int medOrder_Id) {
		return impl.getmMedOrder(medOrder_Id);
	}

	@Override
	public List<MedOrder> getAllMedOrders(int encounter_id) {
		return impl.getAllMedOrders(encounter_id);
	}

	@Override
	public MedOrder updateMedOrder(int medOrder_Id, MedOrder medOrder) {
		return impl.updateMedOrder(medOrder_Id, medOrder);
	}

	@Override
	public boolean deleteMedOrder(int medOrder_Id) {
		return impl.deleteMedOrder(medOrder_Id);
	}
}
