package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserDao;
import com.ty.hospital_app.dto.User;

public class UserDaoImpl implements UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return true;
	}

	@Override
	public boolean updateUser(int user_Id, User user) {
		User user2 = entityManager.find(User.class, user_Id);
		if (user2 != null) {
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public User getUserById(int user_Id) {
		User user = entityManager.find(User.class, user_Id);
		if (user != null) {
			return user;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserByRole(String role) {
		String sql = "SELECT u FROM User u WHERE u.role=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, role);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserByPhone(long phone) {
		String sql = "SELECT u FROM User u WHERE u.phone=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, phone);
		List<User> users = query.getResultList();
		return users.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public User validateUser(String email, String password) {
		String sql = "SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> users = query.getResultList();
		return users.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(sql);
		List<User> users = query.getResultList();
		return users;
	}

	@Override
	public boolean deteleUserById(int user_Id) {
		User user = entityManager.find(User.class, user_Id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
