package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.impl.ItemServiceImpl;

public class UpdateItem {

	public static void main(String[] args) {
		
		ItemServiceImpl impl=new ItemServiceImpl();
		
		Item item=new Item();
		item.setItem_Id(1);
		item.setName("product");
		item.setQuantity(2);
		item.setCost(100);
		impl.updateItemById(item.getItem_Id(), item);
	}
}
