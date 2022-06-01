package com.ty.hospital_app.controller.User;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class TestSaveUser {

	public static void main(String[] args) {
		UserServiceImpl service=new UserServiceImpl();
		
		User user=new User();
		
		user.setName("prashant");
		user.setEmail("p@gmail.com");
		user.setPassword("p123");
		user.setPhone(7766349988l);
		user.setRole("health care");
		service.saveUser(user);
	}
}
