package com.polymorphism.overload;

/*
 * 4.Write a program to overload a constructor in a Student class:

Constructor 1: takes no arguments

Constructor 2: takes roll number

Constructor 3: takes roll number and name

 */
public class Practice4 {

	public Practice4() {
		System.out.println("No argument constructor..");
	}

	public Practice4(int rollNo) {
		System.out.println("Roll No: " + rollNo);
	}

	public Practice4(int rollNo, String name) {
		System.out.println("Roll No: " + rollNo + " Name: " + name);
	}

	public static void main(String[] args) {
		Practice4 p1 = new Practice4();
		Practice4 p2 = new Practice4(101);
		Practice4 p3 = new Practice4(101, "Payal Yadav");
	}
}
