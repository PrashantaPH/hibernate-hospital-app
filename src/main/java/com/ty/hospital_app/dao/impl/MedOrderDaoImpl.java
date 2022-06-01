package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedOrderDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderDaoImpl implements MedOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public MedOrder saveMedOrderDao(int encounter_id, MedOrder medOrder) {
		medOrder.setEncounter(entityManager.find(Encounter.class, encounter_id));
		if (medOrder.getEncounter() == null) {
			return null;
		} else
			entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return medOrder;
	}

	@Override
	public MedOrder getmMedOrder(int medOrder_Id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_Id);
		if (medOrder != null) {
			return medOrder;
		} else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MedOrder> getAllMedOrders(int encounter_id) {
		Query query = entityManager.createQuery("SELECT m FROM MedOrder m WHERE m.encounter_Id=" + encounter_id);
		return query.getResultList();
	}

	@Override
	public MedOrder updateMedOrder(int medOrder_Id, MedOrder medOrder) {
		MedOrder medOrder2 = entityManager.find(MedOrder.class, medOrder_Id);
		medOrder.setEncounter(medOrder2.getEncounter());
		if (medOrder2 == null) {
			return null;
		} else
			entityTransaction.begin();
		entityManager.merge(medOrder);
		entityTransaction.commit();
		return medOrder;
	}

	@Override
	public boolean deleteMedOrder(int medOrder_Id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_Id);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		} else
			return false;
	}
}
