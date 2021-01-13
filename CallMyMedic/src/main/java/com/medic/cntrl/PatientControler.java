package com.medic.cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientControler {

	
	@RequestMapping(value = "/patientRegister")
	public String getRegisterPage() {
		return "PatientRegisterPage";
	}
	
	@RequestMapping(value = "/patientLogin")
	public String getLoginPage() {
		return "PatientLoginPage";
	}
	
	@RequestMapping(value = "/patient/index")
	public String getIndexPage() {
		return "PatientIndexPage";
	}
	
}
