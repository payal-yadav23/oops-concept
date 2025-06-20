package com.abstractpractice;

import java.util.Scanner;

public class VehicleDetails {

	public static void main(String[] args) {

		System.out.println("Which engine you want to start ?");
		System.out.println("1.Car");
		System.out.println("2.Bike");
		System.out.println("3.Truck");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 1:
			Car c = new Car();
			c.startEngine();
			break;
		case 2:
			Bike b = new Bike();
			b.startEngine();
			break;
		case 3:
			Truck t = new Truck();
			t.startEngine();
			break;
		}

	}

}
