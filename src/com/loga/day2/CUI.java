package com.loga.day2;

public class CUI {

	public static String userNameDatabase = "user";
	public static String passwordDatabase = "pass";
	
	public static Boolean validateUser(String userName, String password) {
		if (userName.equals(userNameDatabase) && password.equals(passwordDatabase)) {
			System.out.println("Welcome " + userName);
			return true;
		}
		return false;
	}


}
