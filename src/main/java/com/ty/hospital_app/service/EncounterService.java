package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterService {

	public boolean createEncounter(int branch_Id, int person_Id,Encounter encounter);

	public Encounter getEncounterById(int encounter_Id);

	public List<Encounter> getAllEncountersByPerson(int person_Id);

	public List<Encounter> getAllEncountersByBranch(int branch_Id);

	public boolean deleteEncounterById(int encounter_Id);

	public boolean updateEncounterById(int encounter_Id,Encounter encounter);
}
