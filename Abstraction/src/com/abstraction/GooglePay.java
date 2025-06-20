package com.abstraction;

public class GooglePay implements OnlinePayment {

	@Override
	public void makePayment() {

		System.out.println("Hey welcome to GooglePay.." + OnlinePayment.balance);
	}

}
