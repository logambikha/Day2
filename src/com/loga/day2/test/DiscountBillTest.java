package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.DiscountBill;

class DiscountBillTest {

	@Test
	void testBillDetails() {
		assertEquals(65, DiscountBill.billDetails(100));
	}

}
