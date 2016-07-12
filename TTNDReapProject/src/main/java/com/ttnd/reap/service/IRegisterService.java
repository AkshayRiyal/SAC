package com.ttnd.reap.service;

public interface IRegisterService {
    public Boolean register(String first_name, String last_name, String dob, String email, String password,
			String gender, String serviceName, String practiceName, String role);
}
