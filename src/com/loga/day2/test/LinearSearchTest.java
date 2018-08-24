package com.loga.day2.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Linearsearch;

class LinearsearchTest {

	@Test
	void testLinearSearch() {
		assertEquals("found", Linearsearch.linearSearch(new int[] {1,2,3,4,5,6,7,8,9}, 2));
		assertEquals("not found", Linearsearch.linearSearch(new int[] {1,2,3,4,5,6,7,8,9}, 12));
	}
}