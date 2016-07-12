package com.ttnd.reap.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttnd.reap.hibernate.dao.RegisterDao;
import com.ttnd.reap.service.IRegisterService;

@Service
public class RegisterSeviceImpl implements IRegisterService {
	@Autowired
   RegisterDao registerDao;

	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}

	@Override
	public Boolean register(String first_name, String last_name, String dob, String email, String password,
			String gender, String serviceName, String practiceName, String role) {
		return registerDao.register(first_name, last_name, dob, email, password, gender, serviceName, practiceName, role);
		
	}

}
