package com.inherit;

public class Dog extends Animal {  // extend keyword helps to extend properties and behavior of parent class i.e. Animal 

	public void dogHabitat(String pet, String color) {
		System.out.println("-------------DOG DETAILS--------------");
		System.out.println("Dogs habitat are:- " + pet);
		System.out.println("Found in colors:- " + color);
	}

	public void types(String breed) {
		System.out.println("Different breeeds are:- " + breed);
	}
}
