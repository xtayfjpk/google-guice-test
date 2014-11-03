package com.xtayfjpk.google.juice.aop;


public class PayPalCreditCardProcessor implements CreditCardProcessor {

	@Override
	public void process() {
		System.out.println("process in PayPalCreditCardProcessor");
	}

}
