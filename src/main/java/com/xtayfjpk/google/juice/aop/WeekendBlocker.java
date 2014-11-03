package com.xtayfjpk.google.juice.aop;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class WeekendBlocker implements MethodInterceptor {
	public WeekendBlocker(){}
	public WeekendBlocker(Provider<Calendar> provider) {
		System.out.println(provider);
	}
	
	@Inject
	private CreditCardProcessor cardProcessor;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Calendar today = new GregorianCalendar();
		String name = today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
		if(name.startsWith("S")) {
			throw new IllegalStateException(invocation.getMethod().getName() + " not allowed on weekends!");
		}
		System.out.println(cardProcessor);
		return invocation.proceed();
	}

}
