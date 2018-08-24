package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void testFindTax() {
		assertEquals(540000, IncomeTax.findTax(1800000));
	}

}