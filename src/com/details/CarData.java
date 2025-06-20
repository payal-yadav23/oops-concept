package com.details;

import com.tka.Car;

public class CarData {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setCarNo(9039);
		c1.setCarBrand("Mercedes");
		c1.setCarModel("GWagon");
		c1.setCarPrice("2.55cr");
		
		System.out.println(c1.toString());
	}
}
