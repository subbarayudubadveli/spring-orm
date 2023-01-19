package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapp.dao.InstructorDao;
import com.myapp.entity.InstructorInfo;
import com.myapp.service.InstructorService;

@Controller
public class LmsController {
 
	@Autowired
	private InstructorService instructorService;
	
	@RequestMapping("/instructor-info")
	public String findAllInstructor(Model model) {
		
		List<InstructorInfo> instructorInfoList = instructorService.getAllInstructorInfo();
		model.addAttribute("instructorsData", instructorInfoList);
		
		return "instructor-info";
	}
}
