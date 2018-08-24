package com.loga.day2;

public class Armstrong {
   public static boolean armstrongCheck(int num) {
	   
	   int rem,temp;
	   int sum=0;
	   temp=num;
	   while(temp>0)
		{
		  
		   rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
	   if(sum==num){
			System.out.println(num + "Amstrong number");
			return true;
		}
		else {
			System.out.println(num + "Not an amstrong number");
		    return false;}


	   
   }
}
