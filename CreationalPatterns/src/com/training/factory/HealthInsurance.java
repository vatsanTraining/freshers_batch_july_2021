package com.training.factory;

import com.training.domains.PolicyQuote;

public class HealthInsurance extends Insurance {

	@Override
	public PolicyQuote getPolicyQuote() {
		
		return new PolicyQuote("Familyfloater", 2,4500.00, "YRL");
	}

}
