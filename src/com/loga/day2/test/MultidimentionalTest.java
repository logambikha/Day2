package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Multidimentional;
class MultidimentionalTest{

	@Test
	void testMultiDimentionalArraySearch() {
		assertEquals(true, Multidimentional.multiDimentionalArraySearch(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 1));
	}


}
