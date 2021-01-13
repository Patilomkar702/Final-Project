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

import com.medic.dao.DoctorRepository;
import com.medic.dao.PatientRepository;
import com.medic.dto.Doctor;
import com.medic.dto.Patient;

@Service
public class DoctorServiceImple implements DoctorService {
	
	@Autowired
	DoctorRepository doctorRepo;
	@Autowired
	HttpSession ses;
	@Override
	public boolean insertDoctor(Doctor doctor) {
		try {
			System.out.println(doctor);
			doctorRepo.save(doctor);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateDoctor(Doctor doctor) {
		try {
			doctorRepo.save(doctor);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public List<Doctor> readAllDoctor() {
		Iterable<Doctor> it = doctorRepo.findAll();
		List<Doctor> arr = new ArrayList<>();
		for(Doctor p : it) {
			arr.add(p);
		}
		return arr;
	}
	@Override
	public boolean isDoctorValid(String mail, String pass) {
		Doctor p = doctorRepo.checkDoctor(mail, pass);
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
