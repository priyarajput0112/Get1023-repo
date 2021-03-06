package model;

public class Course {
	private int courseID;
	private String courseName;
	private int durationInMonths;
	private double fee;
	private Qualification eligibility;
	private static int courseIDGenerator=100;
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, int durationInMonths, double fee, Qualification eligibility) {
		this.courseID=++courseIDGenerator;
		this.courseName = courseName;
		this.durationInMonths = durationInMonths;
		this.fee = fee;
		this.eligibility = eligibility;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Qualification getEligibility() {
		return eligibility;
	}

	public void setEligibility(Qualification eligibility) {
		this.eligibility = eligibility;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseId) {
		this.courseID = courseID;
	}

	
}
