package com.ty.hospital_app.controller.Branch;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.impl.BranchServiceImpl;

public class TestGetAllBranch {

	public static void main(String[] args) {

		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();

		List<Branch> branchs = branchServiceImpl.getAllBranches();

		for (Branch branch : branchs) {
			System.out.println(branch);
		}
	}
}
