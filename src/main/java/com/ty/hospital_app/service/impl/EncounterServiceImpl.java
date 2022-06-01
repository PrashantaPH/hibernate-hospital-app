package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.EncounterDaoImpl;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.EncounterService;

public class EncounterServiceImpl implements EncounterService {

	EncounterDaoImpl daoImpl = new EncounterDaoImpl();

	@Override
	public boolean createEncounter(int branch_Id, int person_Id, Encounter encounter) {
		return daoImpl.createEncounter(branch_Id, person_Id, encounter);
	}

	@Override
	public Encounter getEncounterById(int encounter_Id) {
		return daoImpl.getEncounterById(encounter_Id);
	}

	@Override
	public List<Encounter> getAllEncountersByPerson(int person_Id) {
		return daoImpl.getAllEncountersByPerson(person_Id);
	}

	@Override
	public List<Encounter> getAllEncountersByBranch(int branch_Id) {
		return daoImpl.getAllEncountersByBranch(branch_Id);
	}

	@Override
	public boolean updateEncounterById(int encounter_Id, Encounter encounter) {
		return daoImpl.updateEncounterById(encounter_Id, encounter);
	}

	@Override
	public boolean deleteEncounterById(int encounter_Id) {
		return daoImpl.deleteEncounterById(encounter_Id);
	}
}
