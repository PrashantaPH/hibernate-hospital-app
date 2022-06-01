package com.ty.hospital_app.controller.User;

import java.util.List;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class TestUserGetByRole {

	public static void main(String[] args) {

		UserServiceImpl service = new UserServiceImpl();

		List<User> users = service.getUserByRole("special health care");
		
		for(User user:users)
		{
			System.out.println(user);
		}
	}
}
