package com.loga.day2;

public class MissingNumber {

	public static int[] bubblesort(int array[]) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	// Finding length //0 1 2
	public static int missingNumber(int[] array) {
		array = bubblesort(array);
		int i = 0;
		for (i = 1; i < array.length; i++) {
			if (array[i] - array[i - 1] > 1) { // 1-0 2-1
				System.out.println(array[i - 1] + 1);
				return array[i - 1] + 1;
			}
		}
		System.out.println(array[i - 1] + 1);
		return array[i - 1] + 1;
	}

}
