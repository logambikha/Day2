package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.AbsoluteDifference;

class AbsoluteDifferenceTest {

	@Test
	void testFindAbsoluteDiff() {
		assertEquals(true, AbsoluteDifference.findAbsoluteDifference(new int[] {10, 80, 30, 60, 10, 40}, 5));
	}

}