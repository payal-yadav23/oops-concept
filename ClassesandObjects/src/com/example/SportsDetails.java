package com.example;

public class SportsDetails {

	public static void main(String[] args) {

		Sport s1 = new Sport();

		System.out.println("Sport Name: " + (s1.sportName = "Cricket"));
		System.out.println("Team Name: " + (s1.teamName = "India"));
		System.out.println("Number of Players: " + (s1.numPlayers = 11));
		System.out.println("Head Coach Name: " + (s1.coachName = "Gautam Gambhir"));
		System.out.println("Home City:  " + (s1.homeCity = "Mumbai"));
		System.out.println("Championship Won Year:" + (s1.championshipWon = 2025));
		System.out.println("---------------------------------------------------------------------------------");
		
		
		Sport s2 = new Sport();
		
		
		System.out.println("Sport Name: " + (s2.sportName = "Cricket"));
		System.out.println("Team Name: " + (s2.teamName = "Australia"));
		System.out.println("Number of Players: " + (s2.numPlayers = 11));
		System.out.println("Head Coach Name: " + (s2.coachName = "Tim Nielsen"));
		System.out.println("Home City:  " + (s2.homeCity = "Melbourne, Victoria"));
		System.out.println("Championship Won Year:" + (s2.championshipWon = 2009));
	}

}
