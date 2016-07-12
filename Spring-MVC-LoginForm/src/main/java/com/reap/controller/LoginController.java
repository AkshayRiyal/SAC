package com.reap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reap.service.ILoginService;
import com.reap.service.LoginServiceImpl;

@Controller
public class LoginController {

	@Autowired
	ILoginService loginService;

	public void setLoginService(LoginServiceImpl loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
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
}
