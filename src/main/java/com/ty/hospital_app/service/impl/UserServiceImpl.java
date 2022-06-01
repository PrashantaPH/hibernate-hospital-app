package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.UserDaoImpl;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.UserService;

public class UserServiceImpl implements UserService {

	UserDaoImpl daoImpl = new UserDaoImpl();

	@Override
	public boolean saveUser(User user) {
		return daoImpl.saveUser(user);
	}

	@Override
	public boolean updateUser(int user_Id, User user) {
		return daoImpl.updateUser(user_Id, user);
	}

	@Override
	public User getUserById(int user_Id) {
		return daoImpl.getUserById(user_Id);
	}

	@Override
	public List<User> getUserByRole(String role) {
		return daoImpl.getUserByRole(role);
	}

	@Override
	public User getUserByPhone(long phone) {
		return daoImpl.getUserByPhone(phone);
	}

	@Override
	public User validateUser(String email, String password) {
		return daoImpl.validateUser(email, password);
	}

	@Override
	public List<User> getAllUsers() {
		return daoImpl.getAllUsers();
	}

	@Override
	public boolean deteleUserById(int user_Id) {
		return daoImpl.deteleUserById(user_Id);
	}
}
