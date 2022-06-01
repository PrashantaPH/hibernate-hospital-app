package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemDaoImpl implements ItemDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Item saveItem(int midOrder_Id, Item item) {
		item.setMedOrder(entityManager.find(MedOrder.class, midOrder_Id));
		if (item.getMedOrder() != null) {
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		} else
			return null;
	}

	@Override
	public Item getItemById(int item_Id) {
		Item item = entityManager.find(Item.class, item_Id);
		if (item != null) {
			return item;
		} else
			return null;
	}

	@Override
	public boolean updateItemById(int item_Id, Item item) {
		Item item2 = entityManager.find(Item.class, item_Id);
		item.setMedOrder(item2.getMedOrder());
		if (item2 == null) {
			return false;
		} else
			entityTransaction.begin();
		entityManager.merge(item);
		entityTransaction.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getAllItemByMedOrderId(int medOrder_Id) {
		String sql = "SELECT i FROM Item i WHERE i.medOrder.medOrder_Id=" + medOrder_Id;
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_Id);
		if (medOrder == null) {
			return null;
		}
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	@Override
	public boolean deleteItemById(int item_Id) {
		Item item = entityManager.find(Item.class, item_Id);
		if (item != null) {

			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		} else
			return false;
	}
}
