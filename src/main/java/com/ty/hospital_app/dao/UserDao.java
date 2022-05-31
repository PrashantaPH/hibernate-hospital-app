package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserDao {

	public boolean saveUser(User user);

	public boolean updateUser(int user_Id, User user);

	public User getUserById(int user_Id);

	public List<User> getUserByRole(String role);

	public User getUserByPhone(long phone);

	public User validateUser(String email, String password);

	public List<User> getAllUsers();

	public boolean deteleUserById(int user_Id);
}
