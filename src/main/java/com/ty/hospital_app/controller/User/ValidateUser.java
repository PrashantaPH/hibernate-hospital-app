package com.ty.hospital_app.controller.User;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class ValidateUser {

	public static void main(String[] args) {
		
		UserServiceImpl serviceImpl=new UserServiceImpl();
		
		User user=serviceImpl.validateUser("p@gmail.com", "p123");
		
		if(user != null)
		{
			System.out.println(user);
		}
		else
			System.out.println("No records..!");
	}
}
