package com.xtayfjpk.google.juice.bill;

import com.google.inject.Inject;
import com.xtayfjpk.google.juice.annotation.Repository;

public class RealBillingService implements BillingService {
	private CreditCardProcessor processor;
	private TransactionLog log;
	
	@Inject
	public RealBillingService(@Repository()CreditCardProcessor processor, TransactionLog log) {
		this.processor = processor;
		this.log = log;
	}

	@Override
	public void bill() {
		System.out.println("bill in service");
		System.out.println(processor);
		System.out.println(log);
	}

}
