package com.details;

import com.tka.Employee;

public class EmployeeDetails {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setEmpId(101);
		System.out.println(e1.getEmpId());
		e1.setEmpName("Sarika Mare");
		System.out.println(e1.getEmpName());
		e1.setSalary(9000);
		e1.setEmpRole("Software engg");
		System.out.println(e1.getEmpRole());
		System.out.println(e1.toString());

	}
}
