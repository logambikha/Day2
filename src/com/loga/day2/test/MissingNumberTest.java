package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.MissingNumber;

class MissingNumberTest {

	@Test
	void testMissingNumber() {
		assertEquals(1, MissingNumber.missingNumber(new int[] {0,2,3}));
	}

}
