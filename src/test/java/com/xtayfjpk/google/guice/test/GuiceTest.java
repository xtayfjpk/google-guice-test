package com.xtayfjpk.google.guice.test;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xtayfjpk.google.juice.bill.BillingService;
import com.xtayfjpk.google.juice.module.BillingModule;
import com.xtayfjpk.google.juice.module.CommentModule;
import com.xtayfjpk.google.juice.service.CommentService;


public class GuiceTest {
	
	@Test
	public void test() throws Exception {
		Injector injector = Guice.createInjector(new CommentModule());
		CommentService commentService = injector.getInstance(CommentService.class);
		commentService.comment();
	}
	
	@Test
	public void testBindingAnnotation() throws Exception {
		Injector injector = Guice.createInjector(new BillingModule());
		BillingService billingService = injector.getInstance(BillingService.class);
		billingService.bill();
	}
	
	@Test
	public void testInstanceBidnings() throws Exception {
		Injector injector = Guice.createInjector(new CommentModule());
		CommentService commentService = injector.getInstance(CommentService.class);
		commentService.comment2();
	}
}
