package com.inherit;

import java.util.Scanner;

public class Marks extends Student {

	int sub1;
	int sub2;
	int sub3;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sub1 marks: ");
		sub1 = sc.nextInt();

		System.out.println("Enter sub2 marks: ");
		sub2 = sc.nextInt();

		System.out.println("Enter sub3 marks: ");
		sub3 = sc.nextInt();

	}

	public void total() {
		int calculateMarks;
		calculateMarks = sub1 + sub2 + sub3;
		System.out.println("Total Marks: " + calculateMarks);
		int percentage;
		percentage = calculateMarks * 100 / 300;
		System.out.println("Percentage: " + percentage + "%");
	}
}
