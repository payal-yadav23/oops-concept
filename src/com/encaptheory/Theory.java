package com.encaptheory;

public class Theory {

	/*
	 * Encapsulation :- Binding or Wrapping up the data members and member functions
	 *                  that operates on data into a single unit such as a class is called as encapsulation.
	 * 
	 * Real-World example:- ATM Machine , Medical Capsule , Chocolate Wrapper etc..
	 * 
	 * How Encapsulation is Achieved ? 
	 * => 1. Declaring variables as private (so that they cannot be accessed outside the class)
	 *     2. Generating public getter setter methods directly through source or manually (to read and update the values).
	 * 
	 * Why encapsulation ? 
	 * => 1. Security:- Encapsulation keeps important data hidden. 
	 *    2. Control:- You can decide how data should be set or changed.
	 *    3.Modularity is maintained:- Each object (class) handles its own data & methods.
	 * 
	 * Example given below----
	 */

	private int rollNo;
	private String stuName;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static void main(String[] args) {

		Theory t1 = new Theory();
		t1.setRollNo(101);
		System.out.println("Student Roll no: " + t1.getRollNo());

		t1.setStuName("Payal");
		System.out.println("Student Name: "+t1.getStuName());
	}

}
