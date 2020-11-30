package com.medic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medic.dto.Patient;

public interface PatientService {
	public boolean insertPatient(Patient patient);
	public boolean updatePatient(Patient patient);
	public List<Patient> readAllPateint();
}
