package com.xtayfjpk.google.juice.bill;

public class PayPalCreditCardProcessor implements CreditCardProcessor {

	@Override
	public void process() {
		System.out.println("process in PayPalCreditCardProcessor");
	}

}
