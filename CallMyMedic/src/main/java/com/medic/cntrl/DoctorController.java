package com.medic.cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {
	
	
	@RequestMapping(value = "/doctorRegister")
	public String getRegisterPage() {
		return "DoctorRegisterPage";
	}
	
	@RequestMapping(value = "/doctorLogin")
	public String getLoginPage() {
		return "DoctorLoginPage";
	}
	
	@RequestMapping(value = "/doctor/index")
	public String getIndexPage() {
		return "DoctorIndexPage";
	}
	
}
