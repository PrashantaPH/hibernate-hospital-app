package com.ty.hospital_app.controller.Hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.impl.HospitalServiceImpl;

public class UpdateHospitalById {

public static void main(String[] args) {
		
		HospitalServiceImpl hospitalServiceImpl=new HospitalServiceImpl();
		
		Hospital hospital=new Hospital();
		
		hospital.setHospital_Id(1);
		hospital.setName("APOLO");
		hospital.setWebsite("www.com");
		hospitalServiceImpl.updateHospitalById(hospital.getHospital_Id(), hospital);
}
}
