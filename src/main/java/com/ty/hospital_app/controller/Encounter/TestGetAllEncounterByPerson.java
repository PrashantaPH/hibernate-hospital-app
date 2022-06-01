package com.ty.hospital_app.controller.Encounter;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.impl.EncounterServiceImpl;

public class TestGetAllEncounterByPerson {

	public static void main(String[] args) {

		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();

		List<Encounter> encounters = encounterServiceImpl.getAllEncountersByPerson(1);

		for (Encounter encounter : encounters) {
			System.out.println(encounter);
		}
	}
}
