package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Palindrom;

class PalindromTest {

	@Test
	void testPalindromCheck() {
		assertEquals(true, Palindrom.palindromCheck(121));
		assertEquals(false, Palindrom.palindromCheck(256));
	}

}
