package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.impl.ItemServiceImpl;

public class TestSaveItemByMebOrderId {

	public static void main(String[] args) {
		
		ItemServiceImpl impl=new ItemServiceImpl();
		
		Item item=new Item();
		item.setName("oil");
		item.setCost(20);
		item.setQuantity(2);
		impl.saveItem(1, item);
	}
}
