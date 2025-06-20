package com.abstraction;

public class PhonePay implements OnlinePayment {

	@Override
	public void makePayment() {

		System.out.println("Hey welcome to PhonePay..!" + OnlinePayment.balance);

	}

}
