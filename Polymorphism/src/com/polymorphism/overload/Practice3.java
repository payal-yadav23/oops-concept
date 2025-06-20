package com.polymorphism.overload;

/*
 * 3.Overload a method named display() to:

Display a string

Display an integer

Display a string and an integer together

 */
public class Practice3 {

	public void display(String s) {
		System.out.println("This is STring" + s);
	}

	public void display(int s) {
		System.out.println("This is and integer : " + s);
	}

	public void display(String s, int a) {
		System.out.println(s + " " + a);
	}

	public static void main(String[] args) {

		Practice3 p1 = new Practice3();
		p1.display(" method ");
		p1.display(123456);
		p1.display("string +", 123);

	}

}
