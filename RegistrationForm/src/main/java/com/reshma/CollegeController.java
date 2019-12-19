package com.reshma;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CollegeController {
	@RequestMapping(value="/redirecttocolllege", params="submit", method=RequestMethod.GET)
	public void saveCollegeDetails(HttpServletRequest req, HttpServletResponse res) {
		CollegeData collegeData = new CollegeData();
		collegeData.setCollegeId(req.getParameter("collegeId"));
		collegeData.setCollegeName(req.getParameter("collegeName"));
		collegeData.setCollegeLocation(req.getParameter("location"));
	}
}
