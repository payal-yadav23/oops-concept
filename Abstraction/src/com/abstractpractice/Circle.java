package com.abstractpractice;

import java.util.Scanner;

public class Circle implements Shape {

	@Override
	public void shapeArea() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of Circle: ");
		float radius = sc.nextInt();

		float area = (float) (2 * 3.14 * radius);

		System.out.println("Area of Circle: " + area);

	}

}
