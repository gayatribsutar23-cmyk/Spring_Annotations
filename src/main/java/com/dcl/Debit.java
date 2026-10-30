package com.dcl;

import org.springframework.stereotype.Component;

@Component
public class Debit implements Payment {

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment Done Through Debit Card");
	}
	
	public Debit() {
		System.out.println("Debit Constructor");
	}

}
