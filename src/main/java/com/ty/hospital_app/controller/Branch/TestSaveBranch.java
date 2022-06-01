package com.ty.hospital_app.controller.Branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.impl.BranchServiceImpl;

public class TestSaveBranch {

	public static void main(String[] args) {
		
		BranchServiceImpl branchService=new BranchServiceImpl();
		
		Branch branch=new Branch();
		branch.setName("PP");
		branch.setEmail("p@gmail.com");
		branch.setPhone(2233114455l);
		branchService.saveBranch(1, branch);
	}
}
