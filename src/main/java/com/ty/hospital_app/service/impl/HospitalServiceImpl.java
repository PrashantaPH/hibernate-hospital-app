package com.ty.hospital_app.service.impl;

import com.ty.hospital_app.dao.impl.HospitalDaoImpl;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {

	HospitalDaoImpl daoImpl = new HospitalDaoImpl();

	@Override
	public boolean createHospital(Hospital hospital) {
		return daoImpl.createHospital(hospital);
	}

	@Override
	public Hospital getHospitalById(int Hospital_Id) {
		return daoImpl.getHospitalById(Hospital_Id);
	}

	@Override
	public boolean updateHospitalById(int Hospital_Id, Hospital hospital) {
		return daoImpl.updateHospitalById(Hospital_Id, hospital);
	}

	@Override
	public boolean deleteHospitalById(int Hospital_Id) {
		return daoImpl.deleteHospitalById(Hospital_Id);
	}
}
