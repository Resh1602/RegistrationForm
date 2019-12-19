package com.reshma;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UniversityController {
	@RequestMapping(value="redirecttouniversity", params="submit", method=RequestMethod.GET)
	public void saveUniversityDetails(HttpServletRequest req, HttpServletResponse res) {
		UniversityData uData = new UniversityData();
		uData.setUniversityId(req.getParameter("uid"));
		uData.setUniversityName(req.getParameter("uname"));
		uData.setViceChancellor(req.getParameter("vc"));
	}

}
