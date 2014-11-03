package com.xtayfjpk.google.juice.injectingproviders;

import com.google.inject.Provider;

public class TransactionLogProvider implements Provider<TransactionLog> {

	@Override
	public TransactionLog get() {
		return new DatabaseTransactionLog();
	}

}
