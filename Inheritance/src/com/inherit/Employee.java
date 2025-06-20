package com.inherit;

import java.util.Scanner;

public class Employee {

	int empId;
	String empName;

	public void empDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		empId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Employee Name: ");
		empName = sc.nextLine();

	}
	
	public void empDisplay() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
	}
}
