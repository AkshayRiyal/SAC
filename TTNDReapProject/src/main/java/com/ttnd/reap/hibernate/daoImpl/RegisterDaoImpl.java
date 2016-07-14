package com.ttnd.reap.hibernate.daoImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.hibernate.dao.RegisterDao;
import com.ttnd.reap.hibernate.hibernateUtil.HibernateUtil;
import com.ttnd.reap.hibernate.model.BadgesSet;
import com.ttnd.reap.hibernate.model.BadgesRemaining;
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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("registerDAO")
public class RegisterDaoImpl implements RegisterDao {

	@Override

	public Boolean register(String first_name, String last_name, String dob, String email, String password,
			String gender, String serviceName, String practiceName, String role) {
		Map<String, List<Integer>> map = new HashMap();
		// User (Default role) (3 Gold, 2 Silver, 1 Bronze)
		List<Integer> al1 = new ArrayList();
		al1.add(3);
		al1.add(2);
		al1.add(1);
		map.put("User", al1);

		// Supervisor (6 Gold, 3 Silver, 2 Bronze)
		List<Integer> al2 = new ArrayList();
		al2.add(6);
		al2.add(3);
		al2.add(2);
		map.put("Supervisor", al2);

		// Practice Head (9 Gold, 6 Silver, 3 Bronze)
		List<Integer> al3 = new ArrayList();
		al3.add(9);
		al3.add(6);
		al3.add(3);
		map.put("Practice Head", al3);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date = dateFormat.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee = new Employee(first_name, last_name, date, email, password, gender, serviceName,
				practiceName, role);
		BadgesRemaining badgesRemaining = new BadgesRemaining();
		badgesRemaining.setEid(employee);
		badgesRemaining.setBid(BadgesSet.getBadgesSet());
		badgesRemaining.setValue(map.get(employee.getRole()));

		System.out.println("In Check register");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(employee);
		session.save(badgesRemaining);
		transaction.commit();
		session.close();
		return true;

	}

}
