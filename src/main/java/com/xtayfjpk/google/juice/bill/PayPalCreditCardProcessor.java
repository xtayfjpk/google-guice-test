package com.xtayfjpk.google.juice.bill;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class PayPalCreditCardProcessor implements CreditCardProcessor {
	@Inject @Named("value")
	private String value;

	@Override
	public void process() {
		System.out.println("value in processor=" + value);
		System.out.println("process in PayPalCreditCardProcessor");
	}

}
