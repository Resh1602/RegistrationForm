package com.reshma;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClassController {
	@RequestMapping(value="/redirecttoclass", params="submit", method=RequestMethod.GET)
	public void saveClassDetails(HttpServletRequest req, HttpServletResponse res) {
		ClassData classData = new ClassData();
		classData.setClassDivision(req.getParameter("cDivision"));
		classData.setCourse(req.getParameter("course"));
	}

}
