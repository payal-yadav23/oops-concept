package com.example;

public class GadgetDetaills {

	Gadget g1 = new Gadget();

	public void display() {

		System.out.println("Device Name : " + (g1.deviceName = "SmartPhone"));
		System.out.println("Brand : " + (g1.brand = "Samsung S24"));
		System.out.println("Price : " + (g1.price = 125000));
		System.out.println("Processor : " + (g1.processor = "Qualcomm Snapdragon"));
		System.out.println("Baterry Life : " + (g1.batteryLife = "3 years"));
		System.out.println("Warranty Period : " + (g1.warrantyPeriod = 1));

		System.out.println("-----------------------------------------------------------------------------------------");

	}

	public static void show() {

		// static variables will be only accessed in static methods but using classname

		System.out.println("Device Name : " + (Gadget.deviceName = "Laptops"));
		System.out.println("Brand : " + (Gadget.brand = "Dell"));

	}


}
