package com.ty.hospital_app.controller.MedOrder;

import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.impl.MedOrderServiceImpl;

public class TestSaveMedOrder {

	public static void main(String[] args) {
		
		MedOrderServiceImpl impl=new MedOrderServiceImpl();
		
		MedOrder medOrder=new MedOrder();
		
		medOrder.setTotal(1000);
		impl.saveMedOrderDao(1, medOrder);
	}
}
