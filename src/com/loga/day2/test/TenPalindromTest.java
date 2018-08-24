package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.loga.day2.TenPalindrom.TenPalidrom;

class TenPalindromTest {

	TenPalidrom tenPalidrom;

	@BeforeEach
	void setUp() {
		tenPalidrom = new TenPalidrom(new String[] {"abcba", "cdadc", "ahdkjas", "sadhas", "ahdkjas", "sadhas",
				"ahdkjas", "sadhas", "ahdkjas", "sadhas" });
	}

	@AfterEach
	void tearDown() {
		tenPalidrom=null;
	}

	@Test
	void testCheckForPalindromandSetAlphabetically() {
		assertArrayEquals(new String[] { "aabbc", "accdd" },
				tenPalidrom.checkForPalindromandSetAlphabetically());
	}

}
