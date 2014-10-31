package com.xtayfjpk.google.juice.bill;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class DatabaseTransactionLogProvider implements Provider<TransactionLog> {
	@Inject @Named("value")
	private String value;

	@Override
	public TransactionLog get() {
		System.out.println(value);
		return new DatabaseTransactionLog();
	}

}
