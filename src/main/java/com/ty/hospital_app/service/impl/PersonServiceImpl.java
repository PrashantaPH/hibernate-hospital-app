package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.PersonDaoImpl;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.PersonService;

public class PersonServiceImpl implements PersonService {

	PersonDaoImpl daoImpl = new PersonDaoImpl();

	@Override
	public boolean savePerson(Person person) {
		return daoImpl.savePerson(person);
	}

	@Override
	public boolean deletePersonById(int person_Id) {
		return daoImpl.deletePersonById(person_Id);
	}

	@Override
	public boolean updatePerson(int person_Id, Person person) {
		return daoImpl.updatePerson(person_Id, person);
	}

	@Override
	public Person getPersonById(int person_Id) {
		return daoImpl.getPersonById(person_Id);
	}

	@Override
	public List<Person> getAllPersons() {
		return daoImpl.getAllPersons();
	}
}
