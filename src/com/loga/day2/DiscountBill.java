package com.loga.day2;

public class DiscountBill {

	// Bill function
	public static float billDetails(float newItem) {
		float discount = (float) (newItem * 0.35);
		float newItemPrice = newItem - discount;
		return newItemPrice;
	}

}