package com.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
	
		System.out.println("Dog Details - Golden Retriever");
		System.out.println("Barks : bow!- Bow!");
		
	}

	@Override
	public void color() {
		System.out.println("Color : Golden");
		
	}

	
}
