package com.abstractpractice;

import java.util.Scanner;

public class Sqaure implements Shape{

	@Override
	public void shapeArea() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter side of square number: ");
		int side = sc.nextInt();
		
		int area = side * side;
		System.out.println("Area of SQuare: "+area);
		
	}

}
