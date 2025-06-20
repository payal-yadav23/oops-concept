package com.inheritheory;

public class Theory {

	
	/*
	 * Inheritance :- Inheritance is a fundamental concept in Object oriented programming in Java, that allows
	 *                the subclass/child class to acquire properties(fields) and behavior(methods) of superclass / parent class.
	 *            
	 * Syntax:        class Parent{
	 *                               //fields and methods 
	 *                             }
	 *                         
	 *                class Child extends Parent{
	 *                                            //fields and methods (additional)
	 *                                           }
	 *                                           
	 * How Inheritance is Achieved ?
	 * => Inheritance is achieved with the help of 'extends' keyword. This allows child class to inherits
	 *     properties and behavior of parent class.
	 *     
	 * Why we use Inheritance ?
	 * => 1. Code Re-usability.
	 *    2. Method Overriding.
	 *    3. Code becomes more manageable and organized.
	 *    4. Helps in achieving runtime polymorphism.
	 *
	 * Below example is parent class and theory2 inherits this class.
	 */
	
	public Theory() {
		
		System.out.println("Theory constructor...");
	}
}
	
