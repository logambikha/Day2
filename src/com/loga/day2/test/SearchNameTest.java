package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.SearchName;

class SearchNameTest {

	@Test
	void testCheckNameCount() {
		assertEquals(1, SearchName.checkNameCount(new String[] {"Davea", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"}, "Davea"));
		assertEquals(0, SearchName.checkNameCount(new String[] {"Davea", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"}, "Sudhu"));

	}
}
