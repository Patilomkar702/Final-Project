package com.medic.cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientControler {

	@RequestMapping(value = "/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value = "/patientLogin.htm")
	public String getRegisterPage() {
		return "PatientRegisterPage";
	}
	
	
}
