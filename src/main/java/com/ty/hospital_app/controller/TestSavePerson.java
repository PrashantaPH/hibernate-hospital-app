
package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.impl.PersonServiceImpl;

public class TestSavePerson {

	public static void main(String[] args) {
		
		PersonServiceImpl impl=new PersonServiceImpl();
		
		Person person=new Person();
		person.setName("ram");
		person.setEmail("ram@gmail.com");
		person.setPhone(9922334455l);
		
		impl.savePerson(person);
	}
}
