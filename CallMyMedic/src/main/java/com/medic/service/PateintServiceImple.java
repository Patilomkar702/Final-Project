package com.medic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medic.dao.PatientRepository;
import com.medic.dto.Patient;

@Service
public class PateintServiceImple implements PatientService {
	
	@Autowired
	PatientRepository patientRepo;

	@Override
	public boolean insertPatient(Patient patient) {
		try {
			patientRepo.save(patient);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updatePatient(Patient patient) {
		try {
			patientRepo.save(patient);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public List<Patient> readAllPateint() {
		Iterable<Patient> it = patientRepo.findAll();
		List<Patient> arr = new ArrayList<>();
		for(Patient p : it) {
			arr.add(p);
		}
		return arr;
	}

}
