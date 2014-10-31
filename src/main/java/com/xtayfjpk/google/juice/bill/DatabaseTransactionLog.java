package com.xtayfjpk.google.juice.bill;

public class DatabaseTransactionLog implements TransactionLog {

	@Override
	public void log() {
		System.out.println("log in DatabaseTransaction");
	}

}
