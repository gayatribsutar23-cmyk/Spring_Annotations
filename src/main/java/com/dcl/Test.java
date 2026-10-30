package com.dcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("IOC Container Started");
		
		PaymentService p = context.getBean(PaymentService.class);
		p.paying();
	}

}
