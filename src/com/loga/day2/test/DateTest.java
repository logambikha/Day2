package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Date;


class DateTest {

	@Test
	void  testGetDate() {
		assertEquals("04/May/2015",Date.getDate("04,05,2015"));


	}

}
