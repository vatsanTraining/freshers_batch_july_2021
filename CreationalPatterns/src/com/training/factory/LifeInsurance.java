package com.training.factory;

import com.training.domains.PolicyQuote;

public class LifeInsurance extends Insurance {

	@Override
	public PolicyQuote getPolicyQuote() {
		
		return new PolicyQuote("JeevanBheema",20L, 3500.00, "QTR");
	}

}
