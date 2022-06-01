package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ObservationDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Observation;

public class ObservationDaoImpl implements ObservationDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean saveObservation(int encounter_Id, Observation observation) {
		observation.setEncounter(entityManager.find(Encounter.class, encounter_Id));
		if (observation == null)
			return false;
		else
			entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		return true;
	}

	@Override
	public Observation getObservationById(int observation_Id) {
		Observation observation = entityManager.find(Observation.class, observation_Id);
		if (observation != null) {
			return observation;
		} else
			return null;
	}

	@Override
	public boolean deleteObservation(int observation_Id) {
		Observation observation = entityManager.find(Observation.class, observation_Id);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateObservation(int observation_Id, Observation observation) {
		Observation observation2 = entityManager.find(Observation.class, observation_Id);
		observation.setEncounter(observation2.getEncounter());
		if (observation2 == null)
			return false;
		else
			entityTransaction.begin();
		entityManager.merge(observation);
		entityTransaction.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Observation> getAllObservationsByEncounterId(int encounter_Id) {
		Query query = entityManager
				.createQuery("select e from Observation e where e.Encounter.encounter_Id = " + encounter_Id);
		return query.getResultList();
	}

}
