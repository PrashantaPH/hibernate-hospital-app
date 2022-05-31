package com.ty.hospital_app.dao;

import java.util.List;
import com.ty.hospital_app.dto.Branch;

public interface BranchDao {

	public boolean saveBranch(int hospital_Id, Branch branch);

	public Branch getBranchById(int branch_Id);

	public Branch getBranchByName(String name);

	public boolean deleteBranchById(int branch_Id);

	public boolean updateBranchById(int branch_Id, Branch branch);

	public List<Branch> getAllBranches();
}
