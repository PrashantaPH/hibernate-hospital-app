package com.ty.hospital_app.controller.Encounter;

import com.ty.hospital_app.service.EncounterService;
import com.ty.hospital_app.service.impl.EncounterServiceImpl;

public class TestDeleteEncounter {

	public static void main(String[] args) {
		EncounterService encounterService = new EncounterServiceImpl();

		encounterService.deleteEncounterById(1);
	}
}
