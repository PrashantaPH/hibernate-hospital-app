package com.ty.hospital_app.controller.Hospital;

import com.ty.hospital_app.dto.Hospital;

import com.ty.hospital_app.service.impl.HospitalServiceImpl;

public class TestHospitalById {

	public static void main(String[] args) {
		
		HospitalServiceImpl hospitalServiceImpl=new HospitalServiceImpl();
		
		Hospital hospital=hospitalServiceImpl.getHospitalById(1);
		
		if(hospital != null)
		{
			System.out.println(hospital);
		}
	}
}
