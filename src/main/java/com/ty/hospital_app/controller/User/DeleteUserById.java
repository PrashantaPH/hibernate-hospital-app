package com.ty.hospital_app.controller.User;

import com.ty.hospital_app.service.impl.UserServiceImpl;

public class DeleteUserById {

	public static void main(String[] args) {

		UserServiceImpl serviceImpl = new UserServiceImpl();

		serviceImpl.deteleUserById(7);
	}
}
