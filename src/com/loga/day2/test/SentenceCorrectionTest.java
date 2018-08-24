package com.loga.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day2.SentenceCorrection;

class SentenceCorrectionTest {

	@Test
	void testCorrectionSentence() {
		assertEquals("A MORNING WALK A IS BLESSING FOR THE WHOLE DAY. ", SentenceCorrection.correctionSentence("A   MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY.", 4));
	}

}
