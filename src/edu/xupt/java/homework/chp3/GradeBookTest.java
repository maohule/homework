package edu.xupt.java.homework.chp3;

public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook gradeBook1=new GradeBook("英语","张三");
		GradeBook gradeBook2=new GradeBook("物理","李四");
		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
		System.out.printf("gradeBook1 course name is:%s\n",gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is:%s\n",gradeBook2.getCourseName());
		
		
	}

}
