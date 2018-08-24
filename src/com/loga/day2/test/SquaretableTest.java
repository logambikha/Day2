package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Squaretable;


class SquaretableTest {
	@Test
	void testPrintSquare() {
		assertEquals("Not Valid", Squaretable.printSquare(-5));
		assertEquals("5*1=5,Square=25", Squaretable.printSquare(5));
	}


}
