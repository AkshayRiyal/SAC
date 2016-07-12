package com.ttnd.reap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ttnd.reap.service.IRegisterService;

@Controller
public class RegisterController {
	@Autowired
	IRegisterService registerService;

	public void setRegisterService(IRegisterService registerService) {
		this.registerService = registerService;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String registerData(Model model, @ModelAttribute("registerBean") RegisterBean registerBean) {
		System.out.println(registerService);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
		if (registerService.register(registerBean.getFirst_name(), registerBean.getLast_name(), registerBean.getDob()
				,registerBean.getEmail(),
				registerBean.getPassword(),registerBean.getGender(), registerBean.getServices(), registerBean.getPractice()
				, registerBean.getRole()))
			;
		return "done";
	}
}
