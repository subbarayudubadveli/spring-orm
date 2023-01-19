package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapp.dao.InstructorDao;
import com.myapp.entity.InstructorInfo;

@Controller
public class LmsController {
 
	@Autowired
	private InstructorDao instructorDao;
	
	@RequestMapping("/instructor-info")
	public String findAllInstructor(Model model) {
		
		List<InstructorInfo> instructorInfoList = instructorDao.getAllInstructorInfo();
		model.addAttribute("instructorsData", instructorInfoList);
		
		return "instructor-info";
	}
}
