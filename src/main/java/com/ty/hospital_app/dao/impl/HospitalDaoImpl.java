package com.ty.hospital_app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.HospitalDao;
import com.ty.hospital_app.dto.Hospital;

public class HospitalDaoImpl implements HospitalDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean createHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return true;
	}

	@Override
	public Hospital getHospitalById(int Hospital_Id) {
		Hospital hospital = entityManager.find(Hospital.class, Hospital_Id);
		if(hospital==null) {
			return null;
		}
		return hospital;
	}

	@Override
	public boolean updateHospitalById(int Hospital_Id, Hospital hospital) {
		Hospital hos = entityManager.find(Hospital.class, Hospital_Id);
		if(hos!=null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteHospitalById(int Hospital_Id) {
		Hospital hos = entityManager.find(Hospital.class, Hospital_Id);
		if(hos!=null) {
			entityTransaction.begin();
			entityManager.remove(hos);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
}
