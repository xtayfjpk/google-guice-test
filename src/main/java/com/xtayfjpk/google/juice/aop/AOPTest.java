package com.xtayfjpk.google.juice.aop;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AOPTest {
	
	@Test
	public void test() throws Exception {
		Injector injector = Guice.createInjector(new NotOnWeekendsModule());
		injector.getInstance(BillingService.class).bill();
	}
}
