package com.xtayfjpk.google.guice.test;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xtayfjpk.google.juice.bill.BillingService;
import com.xtayfjpk.google.juice.bill.CreditCardProcessor;
import com.xtayfjpk.google.juice.bill.PayPalCreditCardProcessor;
import com.xtayfjpk.google.juice.bill.TransactionLog;
import com.xtayfjpk.google.juice.bill.TransactionLogFactory;
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
	
	@Test
	public void testScope() throws Exception {
		Injector injector = Guice.createInjector(new BillingModule());
		BillingService billingService = injector.getInstance(BillingService.class);
		System.out.println(billingService);
		System.out.println(injector.getInstance(BillingService.class));
	}
	
	@Test
	public void testOndemandInjection() throws Exception {
		Injector injector = Guice.createInjector(new BillingModule());
		CreditCardProcessor cardProcessor = new PayPalCreditCardProcessor();
		cardProcessor.process();
		injector.injectMembers(cardProcessor);
		cardProcessor.process();
	}
	
	@Test
	public void testStaticInjection() throws Exception {
		Injector injector = Guice.createInjector(new BillingModule());
		System.out.println(TransactionLogFactory.getInstance());
		TransactionLogFactory factory = injector.getInstance(TransactionLogFactory.class);
		System.out.println(factory);
		factory.print();
	}
	
	@Test
	public void testAutomaticInjection() throws Exception {
		Injector injector = Guice.createInjector(new BillingModule());
		TransactionLog log = injector.getInstance(TransactionLog.class);
		System.out.println(log);
	}
}
