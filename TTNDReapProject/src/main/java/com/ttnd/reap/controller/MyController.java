package com.ttnd.reap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ttnd.reap.service.ILoginService;
import com.ttnd.reap.service.IRegisterService;
import com.ttnd.reap.serviceImpl.LoginServiceImpl;

@Controller

public class MyController {
    
	@Autowired
	ILoginService loginService;
	@Autowired
	IRegisterService registerService;

	public void setLoginService(LoginServiceImpl loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
		return "login";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
		System.out.println(loginService);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
		if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
			if (loginService.checkLogin(loginBean.getUserName(), loginBean.getPassword())) {
				model.addAttribute("msg", loginBean.getUserName());
				return "dashboard";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return "login";
		}
	}

	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String registerData(Model model, @ModelAttribute("registerBean") RegisterBean registerBean) {
		System.out.println(registerService);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
		if (registerService.register(registerBean.getFirst_name(), registerBean.getLast_name(), registerBean.getDob(),
				registerBean.getEmail(), registerBean.getPassword(), registerBean.getGender(),
				registerBean.getServices(), registerBean.getPractice(), registerBean.getRole()))
			;
		return "success";
	}

}
