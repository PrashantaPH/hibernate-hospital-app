package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.AddressDaoImpl;
import com.ty.hospital_app.dao.impl.ItemDaoImpl;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.ItemService;

public class ItemServiceImpl implements ItemService {

	ItemDaoImpl impl=new ItemDaoImpl();
	@Override
	public Item saveItem(int midOrder_Id, Item item) {
		return impl.saveItem(midOrder_Id, item);
	}

	@Override
	public Item getItemById(int item_Id) {
		return impl.getItemById(item_Id);
	}

	@Override
	public boolean updateItemById(int item_Id, Item item) {
		return impl.updateItemById(item_Id, item);
	}

	@Override
	public List<Item> getAllItemByMedOrderId(int medOrder_Id) {
		return impl.getAllItemByMedOrderId(medOrder_Id);
	}

	@Override
	public boolean deleteItemById(int item_Id) {
		return impl.deleteItemById(item_Id);
	}
}
