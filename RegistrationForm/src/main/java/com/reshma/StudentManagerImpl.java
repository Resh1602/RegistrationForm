package com.reshma;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

public class StudentManagerImpl implements StudentManager {

	private StudentDao sd;
	
	public void setSd(StudentDao sd) {
		this.sd = sd;
	}



	@Transactional
	public void saveStudentData(StudentData studentData) {
		sd.saveStudentData(studentData);
		
	}

}
