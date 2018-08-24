package com.loga.day2;

public class ReverseSentence {

	public static String reverseString(String sentence) {
		StringBuffer outputWord;
		StringBuffer outputSentence = new StringBuffer();
		StringBuffer space = new StringBuffer(" ");
		String[] sentenceArray = sentence.split("\\s+");
		for (int i = 0; i < sentenceArray.length; i++) {
			StringBuffer buffer = new StringBuffer(sentenceArray[i]);
			outputWord = buffer.reverse();
			outputSentence.append(outputWord);
			outputSentence.append(space);
		}
		System.out.print(outputSentence);
		return outputSentence.toString();
	}


}
