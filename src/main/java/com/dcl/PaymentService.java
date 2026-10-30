package com.dcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	private Payment payment;
	
	public PaymentService () {
		System.out.println("0-param Constructor PaymentService");
	}
	
	@Autowired
	public PaymentService(Payment payment) {
		this.payment = payment;
		System.out.println("Param Constructor PaymentService");
	}
	
	void paying() {
		payment.doPayment();
		System.out.println("Payment Veryfied");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
