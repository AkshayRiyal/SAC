package com.ttnd.reap.hibernate.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.ttnd.reap.hibernate.dao.LoginDAO;
import com.ttnd.reap.hibernate.hibernateUtil.HibernateUtil;
import com.ttnd.reap.hibernate.model.Employee;



@Component
public class LoginDAOImpl implements LoginDAO {

	

	public boolean checkLogin(String userName, String userPassword) {
		System.out.println("In Check login");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		boolean userFound = false;

		System.out.println(userName + " " + userPassword);
		Criteria crit = session.createCriteria(Employee.class).add(Restrictions.eq("email", userName));
			

		List<Employee> list = crit.list();
		System.out.println(list.size());
		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		session.close();
		return userFound;
	}
}