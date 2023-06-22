package com.example.BeanLifeCycleSpring;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student {

	int studentId;
	String studentName;
	String studentDept;
	int studentAge;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentAge=" + studentAge + "]";
	}
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("In the destroy method");
//		
//	}
	
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("In the afterPropertiesSet method");
//		
//	}
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("In the init method");
	}
	@PreDestroy
	public void cleanUp() throws Exception{
		System.out.println("In the destroy method cleanUp");
	}
	
	
}
