package com.reap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reap.dao.LoginDAO;

@Service
public class LoginServiceImpl implements ILoginService {

	 @Autowired
	private LoginDAO loginDAO;

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public boolean checkLogin(String userName, String userPassword) {
		System.out.println("In Service class...Check Login");
		return loginDAO.checkLogin(userName, userPassword);
	}

}