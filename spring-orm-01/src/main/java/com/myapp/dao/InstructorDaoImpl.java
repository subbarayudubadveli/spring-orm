package com.myapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.myapp.entity.InstructorInfo;

@Repository
public class InstructorDaoImpl implements InstructorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<InstructorInfo> getAllInstructorInfo() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<InstructorInfo> query = session.createQuery("from InstructorInfo", InstructorInfo.class);
		List<InstructorInfo> instructorList = query.list();
		return instructorList;
	}

}
