package com.ttnd.reap.hibernate.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ttnd.reap.hibernate.hibernateUtil.HibernateUtil;

public class BadgesSet {
    
	public static Set getBadgesSet() {
		Badges badges = new Badges();
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Badges.class);
		List list = criteria.list();
		return new HashSet(list);
	}

}
