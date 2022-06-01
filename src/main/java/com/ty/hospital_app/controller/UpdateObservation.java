package com.ty.hospital_app.controller;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.impl.ObservationServiceImpl;

public class UpdateObservation {

	public static void main(String[] args) {
		
		ObservationServiceImpl impl=new ObservationServiceImpl();
		
		Observation observation=new Observation();
		
		observation.setObservation_Id(2);
		observation.setDateTime(LocalDateTime.now());
		observation.setRemark("No");
		observation.setStatus("low");
		impl.updateObservation(observation.getObservation_Id(), observation);
	}
}
