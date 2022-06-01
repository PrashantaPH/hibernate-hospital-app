package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.BranchDaoImpl;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.BranchService;

public class BranchServiceImpl implements BranchService {

	BranchDaoImpl branchDaoImpl = new BranchDaoImpl();

	@Override
	public boolean saveBranch(int hospital_Id, Branch branch) {
		return branchDaoImpl.saveBranch(hospital_Id, branch);
	}

	@Override
	public Branch getBranchById(int branch_Id) {
		return branchDaoImpl.getBranchById(branch_Id);
	}

	@Override
	public Branch getBranchByName(String name) {
		return branchDaoImpl.getBranchByName(name);
	}

	@Override
	public boolean deleteBranchById(int branch_Id) {
		return branchDaoImpl.deleteBranchById(branch_Id);
	}

	@Override
	public boolean updateBranchById(int branch_Id, Branch branch) {
		return branchDaoImpl.updateBranchById(branch_Id, branch);
	}

	@Override
	public List<Branch> getAllBranches() {
		return branchDaoImpl.getAllBranches();
	}
}
