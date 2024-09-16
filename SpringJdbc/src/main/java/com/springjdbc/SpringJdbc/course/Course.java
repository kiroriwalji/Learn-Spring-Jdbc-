package com.springjdbc.SpringJdbc.course;



//id, coursename, teacher
public class Course {
	private int id;
	private String coursename;
	private String teacher;
	
	
	
	
	
	public Course() {
		
	}


	public Course(int id, String coursename, String teacher) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.teacher = teacher;
	}


	public int getId() {
		return id;
	}



	public String getCoursename() {
		return coursename;
	}



	public String getTeacher() {
		return teacher;
	}





	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", teacher=" + teacher + "]";
	}
	
	
	// default constructor 
	// COnstructor 
	// getter
	
	// to string 
	
}
