package com.tka;

public class Bank {

	private int accNo;
	private String holderName;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void depositeBal(int depoBal) {
		balance = depoBal + balance;
		System.out.println("Balance after deposite : " + balance);
	}

	public void withdrawBal(int withdrawal) {

		System.out.println("Withdraw amt: " + withdrawal);

		if (balance >= withdrawal) {
			balance = balance - withdrawal;
			System.out.println("Balance after withdraw: " + balance);
		} else {
			System.out.println("Not Sufficient balance..!!");
		}
	}

}
