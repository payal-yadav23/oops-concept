package com.example;

public class Gadget {

	static String deviceName;
	static String brand;
	int price;
	String batteryLife;
	String processor;
	int warrantyPeriod;
	
	public static void main(String[] args) {

		GadgetDetaills gd = new GadgetDetaills();
		gd.display();
		GadgetDetaills.show();

	}
	
}
