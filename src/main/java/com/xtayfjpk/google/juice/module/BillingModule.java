package com.xtayfjpk.google.juice.module;

import com.google.inject.AbstractModule;
import com.xtayfjpk.google.juice.annotation.Repository;
import com.xtayfjpk.google.juice.bill.BillingService;
import com.xtayfjpk.google.juice.bill.CreditCardProcessor;
import com.xtayfjpk.google.juice.bill.DatabaseTransactionLog;
import com.xtayfjpk.google.juice.bill.PayPalCreditCardProcessor;
import com.xtayfjpk.google.juice.bill.RealBillingService;
import com.xtayfjpk.google.juice.bill.TransactionLog;

public class BillingModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(BillingService.class).to(RealBillingService.class);
		this.bind(TransactionLog.class).to(DatabaseTransactionLog.class);
		this.bind(CreditCardProcessor.class).annotatedWith(Repository.class)
		.to(PayPalCreditCardProcessor.class);
	}

}
