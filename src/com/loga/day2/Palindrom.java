package com.loga.day2;

public class Palindrom {

	public static Boolean palindromCheck(int number) {
		int originalNumber = number;
		if (number <= 0) {
			return false;
		}
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if (reverse == originalNumber) {
			return true;
		} else {
			return false;
		}
	}

}
