package com.ttnd.reap.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttnd.reap.hibernate.dao.LoginDAO;
import com.ttnd.reap.service.ILoginService;

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