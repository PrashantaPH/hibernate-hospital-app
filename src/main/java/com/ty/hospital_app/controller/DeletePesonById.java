package com.ty.hospital_app.controller;

import com.ty.hospital_app.service.impl.PersonServiceImpl;

public class DeletePesonById {

	public static void main(String[] args) {
		
		PersonServiceImpl  impl=new PersonServiceImpl();
		
		impl.deletePersonById(1);
	}
}
