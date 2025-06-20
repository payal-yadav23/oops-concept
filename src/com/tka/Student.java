package com.tka;

public class Student {

	private int rollNo;
	private String stuName;
	private float marks;
	private String favSub;

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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getFavSub() {
		return favSub;
	}

	public void setFavSub(String favSub) {
		this.favSub = favSub;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", marks=" + marks + ", favSub=" + favSub + "]";
	}

}
