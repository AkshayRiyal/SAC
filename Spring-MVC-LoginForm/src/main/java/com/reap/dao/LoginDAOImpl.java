package com.reap.dao;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.reap.HibernateUtil.HibernateUtil;
import com.reap.model.Employee;


public class LoginDAOImpl implements LoginDAO{
     
			 
       @Resource(name="sessionFactory")
       protected SessionFactory sessionFactory;

      

       
       public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			sessionFactory=HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			
			System.out.println(userName+" "+userPassword);
			Criteria crit = session.createCriteria(Employee.class).add(Restrictions.like("email",userName ))
					 .add(Restrictions.like("password", userPassword));
			
			List<Employee> list = crit.list();
			System.out.println(list.size());
			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
       }
}