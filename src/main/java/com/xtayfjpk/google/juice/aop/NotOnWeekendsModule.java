package com.xtayfjpk.google.juice.aop;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class NotOnWeekendsModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(CreditCardProcessor.class).to(PayPalCreditCardProcessor.class);
		this.bind(BillingService.class).to(RealBillingService.class);
		this.bind(Calendar.class).to(GregorianCalendar.class);
		/*WeekendBlocker blocker = new WeekendBlocker();
		this.requestInjection(blocker);
		this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(NotOnWeekends.class), blocker);*/
		
		this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(NotOnWeekends.class), new WeekendBlocker(this.getProvider(Calendar.class)));
	}

}
