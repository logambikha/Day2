package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.DuplicateRemove;

class DuplicateRemoveTest {

	@Test
	void testRemoveDuplicate() {
	assertEquals("abc",DuplicateRemove.removeDuplicate("abcabcabc"));	
	}
}
