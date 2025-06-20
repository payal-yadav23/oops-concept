package com.abstraction;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Cat Details - Persian");
		System.out.println("Sound : Meow -Meow !");
	}

	@Override
	public void color() {
		System.out.println("Color : White ");
		
	}

}
