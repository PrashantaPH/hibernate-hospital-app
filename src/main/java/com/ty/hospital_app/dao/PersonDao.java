package com.ty.hospital_app.dao;

import java.util.List;


import com.ty.hospital_app.dto.Person;

public interface PersonDao {

	public boolean savePerson(Person person);

	public boolean deletePersonById(int person_Id);

	public boolean updatePerson(int id, Person person);

	public Person getPersonById(int person_Id);

	public List<Person> getAllPersons();
}
