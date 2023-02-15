package myfirstproject;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
	
	
	 Scanner sc = new Scanner(System.in);
		
		String str2= sc.nextLine();
		System.out.println("shivi gupta from mondh bhadohi :"+str2);
		
		//concatenation
		
		String fn="shivi";
		String ln="gupta";
		String fun= fn+ "@$%" + ln;
		System.out.println(fun);
		
		System.out.println(fun.length());   //--- finding a length of string
		
		//charAt-- 
		for (int i = 0; i < fun.length(); i++) {
			System.out.print(fun.charAt(i));
			
		
		//compare--1st and 2nd string
			//1 st1>st2 : +ve value.  2.)st1 ==st2 :0   3.)st1 < st2 : -ve value
			String st1="shivi";
			String st2="guptaa";
			
		if (st2.compareTo(st1) ==0){
			
		}
		
		
		
		
		
		
}}
}