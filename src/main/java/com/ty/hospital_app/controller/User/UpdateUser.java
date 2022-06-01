package com.ty.hospital_app.controller.User;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserServiceImpl;

public class UpdateUser {

	public static void main(String[] args) {
		
	 UserServiceImpl service=new UserServiceImpl();
	 
	 User user=new User();
	 user.setUser_Id(1);
	 user.setName("Ram");
	 user.setEmail("ram@gmail.com");
	 user.setPassword("ram123");
	 user.setRole("health care");
	 user.setPhone(6336225060l);
	 service.updateUser(1, user);
	}
}
