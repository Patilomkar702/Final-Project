package com.medic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medic.dto.Doctor;


public interface DoctorService {
	public boolean insertDoctor(Doctor doctor);
	public boolean updateDoctor(Doctor doctor);
	public List<Doctor> readAllDoctor();
	public boolean isDoctorValid(String mail,String pass);
}
