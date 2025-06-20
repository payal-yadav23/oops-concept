package com.polymorphism.overload;

/*
 * Overload a method area() to calculate:
    Area of a circle
    Area of a rectangle
    Area of a square

 */
public class Practice1 {

	int area;

	public void shapeArea(float radius) {

		 area =  (int) (3.14 * radius * radius);
		System.out.println("Area of Circle : " + area);
	}

	public void shapeArea(int length, int breadth) {

		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

	public void shapeArea(int side) {

		area = side * side;
		System.out.println("Area of Square : " + area);
	}

	public static void main(String[] args) {
		Practice1 p = new Practice1();
		p.shapeArea(5f);
		p.shapeArea(10, 2);
		p.shapeArea(2);
		

	}

}
