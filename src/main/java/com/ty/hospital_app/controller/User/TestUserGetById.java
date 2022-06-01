package com.ty.hospital_app.controller.User;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class TestUserGetById {

	public static void main(String[] args) {
		
		UserServiceImpl  service=new UserServiceImpl();
		
		User user=service.getUserById(7);
		System.out.println("User ID : "+user.getUser_Id());
		System.out.println("User Name  : "+user.getName());
		System.out.println("User Email : "+user.getEmail());
		System.out.println("User Password  : "+user.getPassword());
		System.out.println("User PhoneNo : "+user.getPhone());
		System.out.println("User Role : "+user.getRole());
		System.out.println("---------------");
	}
}
