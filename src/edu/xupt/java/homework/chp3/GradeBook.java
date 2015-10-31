package edu.xupt.java.homework.chp3;

public class GradeBook {
	private String courseName;
	String teacherName;
	public GradeBook(String name,String teacherName)
	{
		courseName=name;
		this.teacherName=teacherName;
	}
	public void setCourseName(String name)
	{
		courseName=name;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void setTeacherName(String teacherName)
	{
		this.teacherName=teacherName;
	}
	public String getTeacherName()
	{
		return this.teacherName;
	}
	public void displayMessage()
	{
		System.out.printf("Welcome to the grade book for\n%s!\n",getCourseName());
		System.out.printf("This course is presented by:\n%s\n",getTeacherName());
	}
}
