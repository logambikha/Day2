package com.loga.day2;

import java.util.Scanner;

public class DuplicateRemove {
	public static String removeDuplicate (String string ) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		input.close();
		String string2 = "";
		
		for(int i=0; i<string1.length(); i++) {
			Boolean found = false;
			for(int j=0; j<string2.length(); j++) {
				if(string1.charAt(i) == string2.charAt(j)) {
					found = true;
					break;
				}
			}
			if(found == false) {
				//string2 = string2.concat(String.valueOf(string.charAt(i)));
				string2 = string2 + String.valueOf(string1.charAt(i));
			}
			
		}		
		System.out.print(string2);
		return string2;
}}
