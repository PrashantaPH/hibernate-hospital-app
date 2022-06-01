package com.ty.hospital_app.controller.Hospital;

import com.ty.hospital_app.dto.Hospital;

import com.ty.hospital_app.service.impl.HospitalServiceImpl;

public class TestSaveHospital {

	public static void main(String[] args) {

		HospitalServiceImpl hospitalService = new HospitalServiceImpl();

		Hospital  hospital=new  Hospital();
		
		hospital.setName("apolo");
		hospital.setWebsite("WWW.com");
		
		System.out.println(hospitalService.createHospital(hospital));
	}
}
