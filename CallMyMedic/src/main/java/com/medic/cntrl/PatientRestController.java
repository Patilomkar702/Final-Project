package com.medic.cntrl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.medic.dto.Patient;
import com.medic.service.PatientService;

@RestController
public class PatientRestController {
	
	@Autowired
	PatientService patientService;
	
@GetMapping(value = "/findPatients")
	public List<Patient> getAll(){
		List<Patient> arr = patientService.readAllPateint();
		return arr;
	}
	@RequestMapping(value = "/")
	public ModelAndView indexPage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@PostMapping(value = "/patient/insert")
	public boolean insertPateint(@RequestBody Patient patient) {
		System.out.println(patient);
		boolean flag = patientService.insertPatient(patient);
		return flag;
	}
		
	
	@PostMapping(value = "/patient/find")
	public boolean checkPatient(@RequestBody Patient patient){
		System.out.println("Hited find post");
		System.out.println(patient);
		boolean flag = patientService.isPatientValid(patient.getEmail(),patient.getPassword());
		System.out.println("Flag is : " + flag);
		return flag;
		}	

}
