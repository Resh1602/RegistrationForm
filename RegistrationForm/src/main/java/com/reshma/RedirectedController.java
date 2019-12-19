package com.reshma;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectedController {
	
	private StudentManager sm;
	
	public void setSm(StudentManager sm) {
		this.sm = sm;
	}



	@RequestMapping(value="/redirect", params="submit", method=RequestMethod.GET)
	public void save(HttpServletRequest req, HttpServletResponse res) {
		StudentData studentData = new StudentData();
		studentData.setName(req.getParameter("name"));
		studentData.setAge(Integer.parseInt(req.getParameter("age")));
		studentData.setTotalMarks(Integer.parseInt(req.getParameter("totalMarks")));
		studentData.setClassAllotted(req.getParameter("classAllotted"));
		studentData.setCollege(req.getParameter("college"));
		studentData.setUniversity(req.getParameter("university"));
		studentData.setGrade(req.getParameter("grade"));
		
		sm.saveStudentData(studentData);
		
	}

}
