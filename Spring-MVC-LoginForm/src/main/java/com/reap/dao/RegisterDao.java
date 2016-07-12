package com.reap.dao;

import java.util.Date;

import com.reap.pojo.Practice;
import com.reap.pojo.Services;

public interface RegisterDao {
       public Boolean register(String first_name, String last_name, Date dob, String email, String password, String gender,
   			Services serviceName, Practice practiceName, String role);
       
}

