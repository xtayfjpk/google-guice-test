package com.xtayfjpk.google.juice.injectingproviders;

public class DatabaseTransactionLog implements TransactionLog {

	@Override
	public void log() {
		System.out.println("log in DatabaseTransaction");
	}

}
