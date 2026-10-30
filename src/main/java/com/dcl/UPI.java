package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPI implements Payment {
	public UPI() {
		System.out.println("UPI Constructor");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment Done Through UPI");
	}

}
