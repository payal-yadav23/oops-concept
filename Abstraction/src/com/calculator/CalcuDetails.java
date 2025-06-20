package com.calculator;

import java.util.Scanner;

public class CalcuDetails {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.m1();

		System.out.println("Which Calculation you want? ");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		switch (n) {
		case 1:
			c.add();
			break;
		case 2:
			c.subtract();
			break;
		case 3:
			c.multiple();
			break;
		case 4:
			c.divide();
			break;

		}
	}
}
