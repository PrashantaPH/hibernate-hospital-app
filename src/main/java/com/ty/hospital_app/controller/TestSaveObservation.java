package com.ty.hospital_app.controller;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.impl.ObservationServiceImpl;

public class TestSaveObservation {

	public static void main(String[] args) {
		
		ObservationServiceImpl impl=new ObservationServiceImpl();
		
		Observation observation=new Observation();
		observation.setDateTime(LocalDateTime.now());
		observation.setRemark("yes");
		observation.setStatus("high");
		impl.saveObservation(1, observation);
	}
}
