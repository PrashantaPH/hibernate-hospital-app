package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Observation;

public interface ObservationDao {

	public boolean saveObservation(int encounter_Id, Observation observation);

	public Branch getObservationById(int observation_Id);

	public boolean deleteObservation(int observation_Id);

	public boolean updateObservation(int observation_Id, Observation observation);

	public List<Branch> getAllObservationByObservations(int encounter_Id);
}
