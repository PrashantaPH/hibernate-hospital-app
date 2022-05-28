package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao {

	public boolean savePerson(PersonDao person);

	public boolean deletePersonById(int person_Id);

	public boolean updatePerson(int id, PersonDao person);

	public Person getPersonById(int person_Id, Person person);

	public List<Person> getAllPersons();
}
