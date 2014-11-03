package com.xtayfjpk.google.juice.bill;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TransactionLogFactory {
	@Inject @Named("value")
	private String value;
	
	@Inject
	private static DatabaseTransactionLogProvider provider;
	
	public static TransactionLog getInstance() {
		//System.out.println("static value=" + value);
		return provider.get();
	}
	
	public void print() {
		System.out.println("value in factory=" + this.value);
	}
}
