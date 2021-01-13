package com.medic.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medic.dto.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
	
	@Query("from Doctor where email=?1 and password=?2")
	Doctor checkDoctor(String email,String password);
}
