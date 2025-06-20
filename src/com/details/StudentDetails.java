package com.details;

import com.tka.Student;

public class StudentDetails {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.setRollNo(101);
		stu.setStuName("Payal");
		stu.setMarks(91.17f);
		stu.setFavSub("Mathematics");

		System.out.println(stu.toString());
	}
}
