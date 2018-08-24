package com.loga.day2;



public class IncomeTax {
	
	public static double findTax(float salary) {
		
		if (salary > 0 && salary < 180000) {
			System.out.println(0);
			return 0;
		} else if (salary > 181001 && salary < 300000) {
			System.out.println(0.1 * salary);
			return 0.1 * salary;
		} else if (salary > 300001 && salary < 500000) {
			System.out.println(0.2 * salary);
			return 0.2 * salary;
		} else {
			System.out.println(0.3 * salary);
			return 0.3 * salary;
		}
	}

}
