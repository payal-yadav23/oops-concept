package com.polymorphism.overload;

public class Practice2 {

	int sum;

	public void add(int num1, int num2) {

		sum = num1 + num2;
		System.out.println("Addition of 2 numbers : " + sum);
	}

	public void add(double num1, double num2) {

		double sum = (num1 + num2);
		System.out.println("Addition of 2 double numbers: " + sum);
	}

	public void add(int num1, int num2, int num3) {

		sum = num1 + num2 + num3;
		System.out.println("Addition of 3 numbers : " + sum);
	}

	public static void main(String[] args) {

		Practice2 p2 = new Practice2();
		p2.add(10, 10);
		p2.add(10d, 10d);
		p2.add(10, 10, 10);
	}
	
	

}
