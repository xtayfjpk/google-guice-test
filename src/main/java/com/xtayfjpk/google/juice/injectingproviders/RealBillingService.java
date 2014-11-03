package com.xtayfjpk.google.juice.injectingproviders;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class RealBillingService implements BillingService {
	private final Provider<CreditCardProcessor> processorProvider;
	private final Provider<TransactionLog> logProvider; 
	
	@Inject//注入的Provider是单例的
	public RealBillingService(Provider<CreditCardProcessor> processorProvider, Provider<TransactionLog> logProvider) {
		this.processorProvider = processorProvider;
		this.logProvider = logProvider;
	}

	@Override
	public void bill() {
		System.out.println(this.processorProvider.hashCode());
		System.out.println(this.logProvider.hashCode());
		CreditCardProcessor cardProcessor = this.processorProvider.get();
		TransactionLog log = this.logProvider.get();
		System.out.println(cardProcessor);
		System.out.println(log);
		cardProcessor.process();
		log.log();
	}

}
