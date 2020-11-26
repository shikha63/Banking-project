package com.webapp.mvc.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.mvc.dao.CreditDAO;
import com.webapp.mvc.entity.credit;

@Service
public class CreditServiceImpl implements CreditService{

	@Autowired
 private CreditDAO CreditDao;
	
	@Transactional
	public credit getCredit(String Id) {
		return CreditDao.getCredit(Id);
	}

}
