package com.loga.day2;

public class Averagescore {
	public static double[] studentAvg = new double[3];
	public static double[] subjectAvg = new double[3];

	public static double[] studentAverage(double[][] array) {
		double total = 0;
		for (int i = 0; i < array[0].length; i++) {
			total = 0;
			for (int j = 0; j < array.length; j++) {
				total = total + array[i][j];
			}
			System.out.println("Subject " + (i + 1) + " total " + total + " " + "Average " + (double) total / 3);
			studentAvg[i] = (double) total / 3;
		}
		return studentAvg;
	}

	public static double[] subjectAverage(double[][] array) {
		double total = 0;
		for (int i = 0; i < array[0].length; i++) {
			total = 0;
			for (int j = 0; j < array.length; j++) {
				total = total + array[j][i];
			}
			System.out.println("Subject " + (i + 1) + " total " + total + " " + "Average " + (double) total / 3);
			subjectAvg[i] = (double) total / 3;
		}
		return subjectAvg;
	}

}
