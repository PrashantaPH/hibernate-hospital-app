package com.ty.hospital_app.controller.User;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class TestUserGetByPhone {

	public static void main(String[] args) {

		UserServiceImpl service = new UserServiceImpl();

		User user = service.getUserByPhone(63362025060l);
		if (user != null) {

			System.out.println(user);
		}
		else
			System.out.println("No Records...!");
	}
}
