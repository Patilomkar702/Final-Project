package com.medic.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medic.dto.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer>{
	
}
