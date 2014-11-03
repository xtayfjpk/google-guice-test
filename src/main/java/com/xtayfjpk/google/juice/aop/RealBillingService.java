package com.xtayfjpk.google.juice.aop;

import com.google.inject.Inject;

public class RealBillingService implements BillingService {
	private CreditCardProcessor processor;
	
	@Inject
	public RealBillingService(CreditCardProcessor processor) {
		this.processor = processor;
	}

	@Override @NotOnWeekends
	public void bill() {
		System.out.println("bill in service");
		processor.process();
	}

}
