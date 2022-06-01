package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonService {

	public boolean savePerson(Person person);

	public boolean deletePersonById(int person_Id);

	public boolean updatePerson(int person_Id, Person person);

	public Person getPersonById(int person_Id);

	public List<Person> getAllPersons();

}
