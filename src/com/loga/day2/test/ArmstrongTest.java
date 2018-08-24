package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Armstrong;

public class ArmstrongTest {

	@Test
	public void testArmstrongCheck() {
		assertEquals(false,Armstrong.armstrongCheck(155));
		assertEquals(true,Armstrong.armstrongCheck(153));
	}

}
