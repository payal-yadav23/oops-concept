package com.details;

import com.tka.Bank;

public class BankDetails {

	public static void main(String[] args) {

		Bank b1 = new Bank();

		b1.setAccNo(456123);
		System.out.println("Account Number: " + b1.getAccNo());

		b1.setHolderName("Payal Yadav");
		System.out.println("Account Holder Name: " + b1.getHolderName());

		b1.setBalance(25000);
		System.out.println("Total balance: " + b1.getBalance());

		b1.depositeBal(1000);
		b1.withdrawBal(20000);
		b1.withdrawBal(7000);
	}
}
