package com.ty.hospital_app.service;

import java.util.List;
import com.ty.hospital_app.dto.Branch;

public interface BranchService {

	public boolean saveBranch(int hospital_Id, Branch branch);

	public Branch getBranchById(int branch_Id);

	public Branch getBranchByName(String name);

	public boolean deleteBranchById(int branch_Id);

	public boolean updateBranchById(int branch_Id, Branch branch);

	public List<Branch> getAllBranches();
}
