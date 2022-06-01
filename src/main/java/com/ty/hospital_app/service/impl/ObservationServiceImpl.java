package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.ObservationDaoImpl;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.ObservationService;

public class ObservationServiceImpl implements ObservationService {

	ObservationDaoImpl impl = new ObservationDaoImpl();

	@Override
	public boolean saveObservation(int encounter_Id, Observation observation) {
		return impl.saveObservation(encounter_Id, observation);
	}

	@Override
	public Observation getObservationById(int observation_Id) {
		return impl.getObservationById(observation_Id);
	}

	@Override
	public boolean deleteObservation(int observation_Id) {
		return impl.deleteObservation(observation_Id);
	}

	@Override
	public boolean updateObservation(int observation_Id, Observation observation) {
		return impl.updateObservation(observation_Id, observation);
	}

	@Override
	public List<Observation> getAllObservationByObservations(int encounter_Id) {
		return impl.getAllObservationsByEncounterId(encounter_Id);
	}
}
