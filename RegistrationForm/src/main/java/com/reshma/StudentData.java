package com.reshma;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class StudentData {
	String name;
	int age;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollNo;
	int totalMarks;
	String classAllotted;
	String college;
	String university;
	String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public String getClassAllotted() {
		return classAllotted;
	}
	public void setClassAllotted(String classAllotted) {
		this.classAllotted = classAllotted;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", totalMarks=" + totalMarks
				+ ", classAllotted=" + classAllotted + ", college=" + college + ", university=" + university
				+ ", grade=" + grade + "]";
	}
	
	
	
}
