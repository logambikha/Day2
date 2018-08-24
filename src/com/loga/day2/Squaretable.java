package com.loga.day2;

public class Squaretable {

	public static String printSquare(int number)  {
		if(validateData(number)) {
			System.out.println(number +"*1="+number*1 +","+"Square="+number*number);
			return number +"*1="+number*1 +","+"Square="+number*number;
		} else {
			System.out.println("Not Valid");
			return "Not Valid";
		}
	}
	
	public static Boolean validateData(int number) {
		if(number <= 0) {
			return false;
		}
		return true;
	}


}
