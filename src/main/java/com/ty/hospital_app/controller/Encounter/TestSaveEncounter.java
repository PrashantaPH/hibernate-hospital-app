package com.ty.hospital_app.controller.Encounter;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.EncounterService;
import com.ty.hospital_app.service.impl.EncounterServiceImpl;

public class TestSaveEncounter {

	public static void main(String[] args) {
		EncounterService encounterService = new EncounterServiceImpl();

		Encounter encounter = new Encounter();

		encounter.setAdminDateTime(LocalDateTime.now());
		encounter.setDischargeDateTime(LocalDateTime.now());
		encounter.setReason("Some reason");
		encounterService.createEncounter(1, 1, encounter);
	}
}
