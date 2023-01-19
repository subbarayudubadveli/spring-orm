package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dao.InstructorDao;
import com.myapp.entity.InstructorInfo;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDao istructorDao;
	
	@Transactional
	@Override
	public List<InstructorInfo> getAllInstructorInfo() {
		
	return istructorDao.getAllInstructorInfo();
	}

}
