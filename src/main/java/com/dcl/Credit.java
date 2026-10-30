package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Credit implements Payment {

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment done Through Credit Card");
		
	}
	
	public Credit() {
		System.out.println("Credit Constructor");
	}

}
