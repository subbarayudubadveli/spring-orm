package com.myapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myapp.entity.InstructorInfo;

@Component
public class InstructorDaoImpl implements InstructorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<InstructorInfo> getAllInstructorInfo() {
		
		Session session = sessionFactory.openSession();
		Transaction trans= session.getTransaction();
		trans.begin();
		Query<InstructorInfo> query = session.createQuery("from InstructorInfo", InstructorInfo.class);
		List<InstructorInfo> instructorList = query.list();
		trans.commit();
		return instructorList;
	}

}
