package model;

import java.time.LocalDate;

public class Registration {
	private int registrationNo;
	private LocalDate registrationDate;
	private int courseID;
	private int rollNo;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	public Registration(LocalDate registrationDate, int courseID, int rollNo) {
	
		this.registrationDate = registrationDate;
		this.courseID = courseID;
		this.rollNo = rollNo;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRegistrationNo() {
		return registrationNo;
	}
	
	
	

}
