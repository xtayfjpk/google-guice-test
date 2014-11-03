package com.xtayfjpk.google.juice.injectingproviders;


public class PayPalCreditCardProcessor implements CreditCardProcessor {

	@Override
	public void process() {
		System.out.println("process in PayPalCreditCardProcessor");
	}

}
