package com.loga.day2;

public class Multidimentional {

	public static Boolean multiDimentionalArraySearch(int[][] array, int keyToSearch) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == keyToSearch) {
					System.out.println("Found at array[" + (i + 1) + "][" + (j + 1) + "]");
					return true;
				}
			}
		}
		System.out.println("Not Found");
		return false;
	}

}