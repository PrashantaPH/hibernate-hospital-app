package com.ty.hospital_app.controller.MedOrder;

import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.impl.MedOrderServiceImpl;

public class UpdateMedOrder {

	
	
	public static void main(String[] args) {
		MedOrderServiceImpl impl=new MedOrderServiceImpl();
		
		MedOrder medOrder=new MedOrder();
		medOrder.setMedOrdder_Id(1);
		medOrder.setTotal(100);
		impl.updateMedOrder(medOrder.getMedOrdder_Id(), medOrder);
	}
}
