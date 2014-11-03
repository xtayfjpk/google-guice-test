package com.xtayfjpk.google.juice.injectingproviders;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class BillingModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(BillingService.class).to(RealBillingService.class).in(Singleton.class);
		this.bind(CreditCardProcessor.class).toProvider(CreditCardProcessorProvider.class);
		this.bind(TransactionLog.class).toProvider(TransactionLogProvider.class);
	}

}
