package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalDao {

	public boolean createHospital(Hospital hospital);

	public Hospital getHospitalById(int Hospital_Id);

	public boolean updateHospitalById(int Hospital_Id, Hospital hospital);

	public boolean deleteHospitalById(int Hospital_Id);
}
