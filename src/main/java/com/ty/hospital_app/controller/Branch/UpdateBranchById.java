package com.ty.hospital_app.controller.Branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.impl.BranchServiceImpl;

public class UpdateBranchById {

	public static void main(String[] args) {
		
		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();
		
		Branch branch = new Branch();
		branch.setBranch_Id(2);
		branch.setEmail("raj@gmail.com");
		branch.setName("raja");
		branch.setPhone(887766554l);
		branchServiceImpl.updateBranchById(branch.getBranch_Id(), branch);
	}
}
