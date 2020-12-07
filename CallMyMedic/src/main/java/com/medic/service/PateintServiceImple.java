package com.medic.service;

import java.net.http.HttpRequest;

import java.net.http.HttpResponse;
import java.util.ArrayList;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.medic.dao.PatientRepository;
import com.medic.dto.Patient;

@Service
public class PateintServiceImple implements PatientService {
	
	@Autowired
	PatientRepository patientRepo;
	
	@Autowired
	HttpSession ses;
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

	@Override
	public boolean isPatientValid(String mail, String pass) {
		Patient p = patientRepo.checkPatient(mail, pass);
		try {
			int id = p.getId();
			System.out.println(id);
			if(id > 0) {
				ses.setAttribute("user",p);	
				return true;
			}
				
		}catch(NullPointerException e) {
			System.out.println("wrong entry");
			return false;
		}
		return false;
	}

}
