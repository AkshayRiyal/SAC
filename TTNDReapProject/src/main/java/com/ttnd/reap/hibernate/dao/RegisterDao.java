package com.ttnd.reap.hibernate.dao;

import java.util.Date;



public interface RegisterDao {
       public Boolean register(String first_name, String last_name, String dob, String email, String password, String gender,
   			String serviceName, String practiceName, String role);
       
}

