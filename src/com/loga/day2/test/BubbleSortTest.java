package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.BubbleSort;

class BubbleSortTest {

	@Test
	void testBubbleSort() {
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9} ,BubbleSort.bubbleSort(new int[] {7,8,9,6,5,4,2,1,3}));
		assertArrayEquals(new int[] {-8,1,2,3,4,5,6,7,9} ,BubbleSort.bubbleSort(new int[] {7,-8,9,6,5,4,2,1,3}));
//		assertArrayEquals(new int[] {-8,1,2,3,94,5,6,7,9} ,BubbleSort.bubbleSort(new int[] {7,-8,9,6,5,4,2,1,3,94}));
	}

}
