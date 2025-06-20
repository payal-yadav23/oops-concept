package com.inherit;

import java.util.Scanner;

public class Salary extends Employee {

	double salary;
	double DA;
	double gross_salary;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Salary: ");
		salary = sc.nextDouble();
	}

	public void da() {

		DA = 50 * salary / 100;
		gross_salary = DA + salary;
	}

	public void salaryDisplay() {
		System.out.println("Employee  Salary: " + salary);
		System.out.println("Employee salary DA : " + DA);
		System.out.println("EMployee total salary including DA: " + gross_salary);
	}
}
