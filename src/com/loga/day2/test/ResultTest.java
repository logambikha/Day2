package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.Test;

class ResultTest {

	@Test
	void testCheckResult() {
		assertEquals("Passed", Result.checkResult(60,60,60));
		assertEquals("Promoted", Result.checkResult(60,60,30));
		assertEquals("Failed", Result.checkResult(60,30,30));
	}
}
