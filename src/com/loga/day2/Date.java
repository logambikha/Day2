package com.loga.day2;

import java.util.Scanner;
public class Date{

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	String date = input.nextLine();
	input.close();
	getDate(date);
}

public static String getDate(String date) {
	String month;
	String[] Date = date.split(",");
	if (Integer.parseInt(Date[0]) > 31) {
		System.out.println("Wrong Date");
		return "Wrong";
	}
	switch (Date[1]) {
	case "01":
		month = "January";
		break;
	case "02":
		month = "February";
		break;
	case "03":
		month = "March";
		break;
	case "04":
		month = "April";
		break;
	case "05":
		month = "May";
		break;
	case "06":
		month = "June";
		break;
	case "07":
		month = "July";
		break;
	case "08":
		month = "August";
		break;
	case "09":
		month = "September";
		break;
	case "10":
		month = "October";
		break;
	case "11":
		month = "November";
		break;
	case "12":
		month = "December";
		break;
	default:
		System.out.println("Wrong Date");
		return "Wrong";
	}
	System.out.println(Date[0] + "/" + month + "/" + Date[2]);
	return Date[0] + "/" + month + "/" + Date[2];
	
}

}