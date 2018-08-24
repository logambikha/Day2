package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.loga.day2.Interest;

class InterestTest {

	

	Interest interest;

	@BeforeEach
	void setUp() {
		interest = new Interest(100, 3.2, 2);
	}

	@Test
	void testSimpleInterest() {
		assertEquals(6.4, interest.simpleInterest());
	}

	@Test
	void testCompoundInterest() {
		assertEquals(106.5, interest.compoundInterest(), 0.5);
	}

	@AfterEach
	void tearDown() {
		interest = null;
	}

}