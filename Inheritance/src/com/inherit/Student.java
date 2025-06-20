package com.inherit;

import java.util.Scanner;

public class Student {

	int rollNo;
	String stuName;

	public void accept1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll No: ");
		rollNo = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Student Name: ");
		stuName = sc.nextLine();

	}

	public void display() {
		System.out.println("Student Roll No: " + rollNo);
		System.out.println("Student Name: " + stuName);
	}
}
