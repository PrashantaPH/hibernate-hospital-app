package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Observation;

public interface ItemDao {

	public Item saveItem(int midOrder_Id, Item item);

	public Item getItemById(int item_Id);

	public boolean updateItemById(int item_Id, Observation observation, Item item);

	public List<Item> gatAllItemByMedOrderId(int medOrder_Id);

	public boolean deleteItemById(int item_Id);
}
