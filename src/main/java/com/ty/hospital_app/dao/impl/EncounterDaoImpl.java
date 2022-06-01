package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class EncounterDaoImpl implements EncounterDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean createEncounter(int branch_Id, int person_Id, Encounter encounter) {
		encounter.setBranch(entityManager.find(Branch.class, branch_Id));
		encounter.setPerson(entityManager.find(Person.class, person_Id));
		if (encounter.getBranch() == null || encounter.getPerson() == null) {
			return false;
		} else
			entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		return true;
	}

	@Override
	public Encounter getEncounterById(int encounter_Id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_Id);
		if (encounter != null) {
			return encounter;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Encounter> getAllEncountersByPerson(int person_Id) {
		Query query = entityManager.createQuery("SELECT e FROM Encounter e WHERE e.person.person_Id =" + person_Id);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Encounter> getAllEncountersByBranch(int branch_Id) {
		Query query = entityManager.createQuery("SELECT e FROM Encounter e WHERE e.branch.branch_Id =" + branch_Id);
		return query.getResultList();
	}

	@Override
	public boolean deleteEncounterById(int encounter_Id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_Id);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateEncounterById(int encounter_Id, Encounter encounter) {
		Encounter e = entityManager.find(Encounter.class, encounter_Id);
		encounter.setBranch(e.getBranch());
		encounter.setPerson(e.getPerson());
		if (e == null)
			return false;
		else
			entityTransaction.begin();
		entityManager.merge(encounter);
		entityTransaction.commit();
		return true;
	}

}
