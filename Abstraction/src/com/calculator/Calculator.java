package com.calculator;

import java.util.Scanner;

public class Calculator implements Arithmetic {

	int num1;
	int num2;

	public void m1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

	}

	@Override
	public void add() {

		int add = num1 + num2;
		System.out.println("Addition : " + add);

	}

	@Override
	public void subtract() {

		if (num1 > num2) {
			int sub = num1 - num2;
			System.out.println("Subtraction : " + sub);
		} else {
			int sub = num2 - num1;
			System.out.println("Substraction : " + sub);
		}
	}

	@Override
	public void multiple() {

		int mult = num1 * num2;
		System.out.println("Multiplication : " + mult);
	}

	@Override
	public void divide() {

		if (num1 > num2) {
			float div = (float) (num1 / num2);
			System.out.println("Division : " + div);
		} else {
			System.out.println("the answer is zero..");
		}
	}

}
