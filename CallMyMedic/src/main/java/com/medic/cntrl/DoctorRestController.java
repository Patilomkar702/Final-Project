package com.medic.cntrl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.medic.dto.Doctor;
import com.medic.service.DoctorService;


@RestController
public class DoctorRestController {
	
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping(value = "/doctor/insert")
	public boolean insertDoctor(@RequestBody Doctor doctor) {
		System.out.println(doctor);
		boolean flag = doctorService.insertDoctor(doctor);
		return flag;
	}
	
	@GetMapping(value = "/findDoctors")
	public List<Doctor> getAll(){
		List<Doctor> arr = doctorService.readAllDoctor();
		return arr;
	}
	
	
	@PostMapping(value = "/doctor/find")
	public boolean checkDoctor(@RequestBody Doctor doctor){
		System.out.println("Hited find post");
		System.out.println(doctor);
		boolean flag = doctorService.isDoctorValid(doctor.getEmail(),doctor.getPassword());
		System.out.println("Flag is : " + flag);
		return flag;
		}
			

}
