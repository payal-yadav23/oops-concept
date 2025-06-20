package com.abstractpractice2;

import java.util.Scanner;

public class GreetingDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give greetings in -- 1.English 2.Hindi");

		String name = sc.next();
		if (name.equals("English") || name.equals("english") || name.equals("1")) {
			English e = new English();
			e.startHello();
		} else if (name.equals("Hindi") || name.equals("hindi") || name.equals("2")) {
			Hindi h = new Hindi();
			h.startHello();
		}

		else {
			System.out.println("Invalid entry");
			System.out.println(">>>>>>>>>>>>>> THANK YOU FOR VISITING <<<<<<<<<<<<");
		}
	}
}
