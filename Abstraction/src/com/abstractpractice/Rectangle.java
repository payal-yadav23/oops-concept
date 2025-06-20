package com.abstractpractice;

import java.util.Scanner;

public class Rectangle implements Shape {

	@Override
	public void shapeArea() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any length: ");
		int l = sc.nextInt();
		System.out.println("Enter any breadth: ");
		int b = sc.nextInt();
		int area = l * b;
		
		System.out.println("Area of Rectangle >>> "+area);
	}

}
