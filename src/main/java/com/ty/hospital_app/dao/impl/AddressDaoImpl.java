package com.ty.hospital_app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.AddressDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressDaoImpl implements AddressDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean saveAddress(int branch_Id, Address address) {
		address.setBranch(entityManager.find(Branch.class, branch_Id));
		if (address.getBranch() != null) {
			entityTransaction.begin();
			entityManager.persist(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAddressById(int address_Id) {
		Address address = entityManager.find(Address.class, address_Id);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAddress(int address_Id, Address address) {
		Address address2 = entityManager.find(Address.class, address_Id);
		if (address2 != null) {
			entityTransaction.begin();
			entityManager.merge(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public Address getAddressById(int address_Id) {
		Address address = entityManager.find(Address.class, address_Id);
		if (address != null) {
			return address;
		}
		return null;
	}
}
