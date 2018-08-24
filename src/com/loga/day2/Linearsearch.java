package com.loga.day2;

public class Linearsearch {

	// Linear Search function
		public static String linearSearch(int[] array, int keyToSearch) {
			int c = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == keyToSearch) {
					System.out.println("Found at " + (i + 1));
					return "found";
				}
				c++;
				if (c == array.length) {
					System.out.println("Not Found");
					return "not found";
				}
			}
			return "not found";
		}

}
