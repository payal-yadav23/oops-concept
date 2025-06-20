package com.abstractpractice;

import java.util.Scanner;

public class Calling {

	public static void main(String[] args) {

		System.out.println("Which area you want to find ?");
		System.out.println("1.Rectangle   2.Circle   3.Square ");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {

		case 1:
			Rectangle r = new Rectangle();
			r.shapeArea();
			break;

		case 2:
			Circle c = new Circle();
			c.shapeArea();
			break;

		case 3:
			Sqaure s = new Sqaure();
			s.shapeArea();

		default:
			System.out.println(">>>>>>>>> THANK YOU <<<<<<<");
		}

	}
}
