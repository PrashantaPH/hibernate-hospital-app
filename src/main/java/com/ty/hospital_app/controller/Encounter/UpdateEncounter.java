package com.ty.hospital_app.controller.Encounter;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.impl.EncounterServiceImpl;

public class UpdateEncounter {

	public static void main(String[] args) {
		
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		Encounter encounter=new Encounter();
		encounter.setEncounter_Id(1);
		encounter.setAdminDateTime(LocalDateTime.now());
		encounter.setDischargeDateTime(LocalDateTime.now());
		encounter.setReason("i ");
		encounterServiceImpl.updateEncounterById(encounter.getEncounter_Id(), encounter);
	}
}
