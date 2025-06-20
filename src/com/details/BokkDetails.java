package com.details;

import com.tka.Book;

public class BokkDetails {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.setBookId(111);
		System.out.println("Book ID: " + b1.getBookId());
		b1.setBookTitle("It Ends with Us");
		System.out.println("Book Title : " + b1.getBookTitle());
		b1.setAuthor("Collen Hover");
		System.out.println("Book Author:  " + b1.getAuthor());
		b1.setPrice(99.0f);
		System.out.println("Book Price: " + b1.getPrice());
	}
}
