package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.BranchDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchDaoImpl implements BranchDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean saveBranch(int hospital_Id, Branch branch) {
		branch.setHospital(entityManager.find(Hospital.class, hospital_Id));
		if (branch.getHospital() == null)
			return false;
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return true;
	}

	@Override
	public Branch getBranchById(int branch_Id) {
		Branch branch=entityManager.find(Branch.class, branch_Id);
		if(branch != null)
		{
			return branch;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Branch getBranchByName(String name) {
		String sql = "SELECT b Branch b WHERE b.name=" + name;
		Query query = entityManager.createQuery(sql);
		List<Branch> branchs = query.getResultList();
		for (Branch branch : branchs) {
			return branch;
		}
		return null;
	}

	@Override
	public boolean deleteBranchById(int branch_Id) {
		Branch branch = entityManager.find(Branch.class, branch_Id);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateBranchById(int branch_Id, Branch branch) {
		Branch branch2 = entityManager.find(Branch.class, branch_Id);
		branch.setHospital(branch2.getHospital());
		if (branch2 == null)
			return false;
		else
		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Branch> getAllBranches() {
		String sql = "SELECT b FROM Branch b";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}
