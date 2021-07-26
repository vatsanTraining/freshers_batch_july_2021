package com.training.utils;

import java.util.Comparator;

import com.training.model.CreditCard;

public class CardHolderNameComparator implements Comparator<CreditCard> {

	@Override
	public int compare(CreditCard obj1, CreditCard obj2) {

		return obj1.getCardHolderName().compareTo(obj2.getCardHolderName());
	}

}
