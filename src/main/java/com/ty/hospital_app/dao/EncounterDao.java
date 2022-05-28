package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterDao {

	public boolean createEncounter(int branch_Id, int person_Id,Encounter encounter);

	public Encounter getEncounterById(int encounter_Id);

	public List<Encounter> getAllEncountersByPerson(int person_Id);

	public List<Encounter> getAllEncountersByBranch(int branch_Id);

	public boolean deleteEncounterById(int branch_Id, int encounter_Id, int person_Id);

	public boolean updateEncounterById(int encounter_Id,Encounter encounter);
}
