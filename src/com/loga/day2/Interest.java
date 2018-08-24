package com.loga.day2;

public class Interest {



//	private static Boolean validateData(float principal, float rateOfInterest, int timeInYears) {
//		if (principal <= 0 && rateOfInterest <= 0 && timeInYears <= 0) {
//			return false;
//		}
//		return true;
//	}

	private double principleAmount;
	private double rateOfInterest;
	private int timeInYears;

	public Interest(double principleAmount, double rateOfInterest, int timeInYears) {
		this.principleAmount = principleAmount;
		this.rateOfInterest = rateOfInterest;
		this.timeInYears = timeInYears;
	}
	
	public double simpleInterest() {
		double simpleInterest = (principleAmount * rateOfInterest * timeInYears) / 100;
		return simpleInterest;
	}
	
	public double compoundInterest() {
		double ans1 = 1 + (rateOfInterest / 100);
		double compoundInterest = Math.pow(ans1, timeInYears);
		compoundInterest *=  principleAmount;
		return compoundInterest;
	}
}