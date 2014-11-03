package com.xtayfjpk.google.juice.injectingproviders;

import com.google.inject.Provider;

public class CreditCardProcessorProvider implements Provider<CreditCardProcessor> {

	@Override
	public CreditCardProcessor get() {
		return new PayPalCreditCardProcessor();
	}

}
