package com.webapp.mvc.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.mvc.entity.credit;
@Repository
public class CreditDAOImpl implements CreditDAO{

	@Autowired
	private SessionFactory sessionFactory;
	public credit getCredit(String Id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(credit.class, Id);
		
	}

}
