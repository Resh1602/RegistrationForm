package com.reshma;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void saveStudentData(StudentData studentData) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(studentData);
		System.out.println("Student saved successfully, Person Details="+studentData);
		
			
		
	}

}
