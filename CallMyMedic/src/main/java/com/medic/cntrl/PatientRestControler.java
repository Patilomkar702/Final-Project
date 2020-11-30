package com.medic.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medic.dto.Patient;
import com.medic.service.PatientService;

@RestController
public class PatientRestControler {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping(value = "/patient/insert")
	public boolean insertPateint(@RequestBody Patient patient) {
		System.out.println(patient);
		boolean flag = patientService.insertPatient(patient);
		return flag;
	}
	
	@GetMapping(value = "/findPatients")
	public List<Patient> getAll(){
		List<Patient> arr = patientService.readAllPateint();
		return arr;
	}

}
