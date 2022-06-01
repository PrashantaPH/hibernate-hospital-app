package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImpl implements PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return true;
	}

	@Override
	public boolean deletePersonById(int person_Id) {
		Person person = entityManager.find(Person.class, person_Id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean updatePerson(int person_Id, Person person) {
		Person person2 = entityManager.find(Person.class, person_Id);
		if (person2 == null)
			return false;
		else
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		return true;
	}

	@Override
	public Person getPersonById(int person_Id) {
		Person person = entityManager.find(Person.class, person_Id);
		if (person != null) {
			return person;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllPersons() {
		String sql = "SELECT p FROM Person p";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
