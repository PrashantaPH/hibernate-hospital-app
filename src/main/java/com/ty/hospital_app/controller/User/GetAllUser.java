package com.ty.hospital_app.controller.User;

import java.util.List;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class GetAllUser {

	public static void main(String[] args) {

		UserServiceImpl serviceImpl = new UserServiceImpl();

		List<User> users = serviceImpl.getAllUsers();

		if (users != null) {
			for (User user : users) {
				System.out.println(user);
			}
		} else
			System.out.println("No records...!");
	}
}
