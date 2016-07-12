package com.reap.dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.reap.model.*;
import com.reap.pojo.Employee;
import com.reap.pojo.Practice;
import com.reap.pojo.Services;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Query;

import java.util.Date;
import java.util.List;

@Repository("registerDAO")
public class RegisterDaoImpl implements RegisterDao{
     
			 
       @Resource(name="sessionFactory")
       protected SessionFactory sessionFactory;

       public void setSessionFactory(SessionFactory sessionFactory) {
              this.sessionFactory = sessionFactory;
       }
      
       protected Session getSession(){
              return sessionFactory.openSession();
       }

	@Override
	public Boolean register(String first_name, String last_name, Date dob, String email, String password, String gender,
			Services serviceName, Practice practiceName, String role) {
		System.out.println("In Check logi");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		
		
		Employee employee=new Employee(first_name, last_name, dob, email, password, gender, serviceName, practiceName, role);
		
		session.save(employee);

		session.close();
		return userFound; 
		
	}

      
}

