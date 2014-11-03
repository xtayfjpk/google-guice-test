package com.xtayfjpk.google.juice.injectingproviders;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class Test {
	
	@org.junit.Test
	public void test() throws Exception {
		Injector injector = Guice.createInjector(new BillingModule());
		injector.getInstance(BillingService.class).bill();
		injector.getInstance(BillingService.class).bill();
	}
}
