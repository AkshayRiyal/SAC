package com.ttnd.reap.hibernate.daoImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.hibernate.dao.RegisterDao;
import com.ttnd.reap.hibernate.hibernateUtil.HibernateUtil;
import com.ttnd.reap.hibernate.model.Employee;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions; 
import org.hibernate.Criteria;
import org.hibernate.Query;

import java.util.Date;
import java.util.List;

@Repository("registerDAO")
public class RegisterDaoImpl implements RegisterDao {

	@Override
	
	
	public Boolean register(String first_name, String last_name, String dob, String email, String password,
			String gender, String serviceName, String practiceName, String role) {
		System.out.println("In Check logi");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Date date = new Date(dob);
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee(first_name, last_name, date, email, password, gender, serviceName,
				practiceName, role);

		session.save(employee);
		transaction.commit();
		session.close();
		return true;

	}

}
