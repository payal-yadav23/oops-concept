package com.example;

public class UnivesityDetails {

	public static void main(String[] args) {
		University u1 = new University();

		System.out.println("University Name: " + (u1.universityName = "SPPU"));
		System.out.println("University Location: " + (u1.location = "Pune"));
		System.out.println("University Ranking: " + (u1.ranking = 'A'));
		System.out.println("Number of Students: " + (u1.numStudent = 5550));
		System.out.println("Number of Professors: " + (u1.numProfessors = 1250));
		System.out.println("Graduation Level: " + (u1.graduationLevel = "B.Engg"));
		System.out.println("Founding Year: " + (u1.foundingYear = 1920));
		System.out.println("Department: " + (u1.dept = "E&TC"));

		System.out.println("--------------------------------------------------------------------------------------");

		University u2 = new University();

		System.out.println("University Name: " + (u2.universityName = "JSPM"));
		System.out.println("University Location: " + (u2.location = "Pune"));
		System.out.println("University Ranking: " + (u2.ranking = 'A'));
		System.out.println("Number of Students: " + (u2.numStudent = 4360));
		System.out.println("Number of Professors: " + (u2.numProfessors = 850));
		System.out.println("Graduation Level: " + (u2.graduationLevel = "B.Tech"));
		System.out.println("Founding Year: " + (u2.foundingYear = 2006));
		System.out.println("Department: " + (u2.dept = "COMP"));

	}
}
