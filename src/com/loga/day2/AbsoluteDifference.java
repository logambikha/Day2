package com.loga.day2;

public class AbsoluteDifference {
	// Absolute Difference Function
		public static Boolean findAbsoluteDifference(int[] array, int differenceValue) {
			int key = 0;
			int position1 = 0, position2 = 0;
			Boolean found = false;
			while (key != array.length) {
				for (int i = key + 1; i < array.length; i++) {
					if (array[key] == array[i]) {
						position1 = key;
						position2 = i;
						found = true;
						break;
					}
				}
				if (found) {
					break;
				}
				key++;
			}
			if (Math.abs(position1 - position2) < differenceValue) {
				return true;
			} else {
				return false;
			}
		}


}
