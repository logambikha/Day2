package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.Averagescore;

class AveragescoreTest {

	@Test
	void testStudentAverage() {
		assertArrayEquals(new double[] {2.0, 5.0, 8.0}, Averagescore.studentAverage(new double[][] {{1,2,3},{4,5,6},{7,8,9}}));
		
	}
	
	@Test
	void testSubjectAverage() {
		assertArrayEquals(new double[] {4.0, 5.0, 6.0}, Averagescore.subjectAverage(new double[][] {{1,2,3},{4,5,6},{7,8,9}}));
	}

}
