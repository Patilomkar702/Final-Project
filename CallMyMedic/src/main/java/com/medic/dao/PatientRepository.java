package com.medic.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medic.dto.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer>{
	
	@Query("from Patient where email=?1 and password=?2")
	Patient checkPatient(String email,String password);
}
