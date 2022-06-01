package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.impl.PersonServiceImpl;

public class UpdatePerson {

	public static void main(String[] args) {
		
		PersonServiceImpl impl=new PersonServiceImpl();
		
		Person person=new Person();
		
		person.setPerson_id(1);
		person.setName("ravi");
		person.setEmail("r@gmail.com");
		person.setPhone(998765432l);
		impl.updatePerson(person.getPerson_id(), person);
	}
}
