package myfirstproject;

import java.util.Scanner;

public class REverseSTring {

	public static void main(String[] args) {
		   
		
		/*
		 * String result= ""; System.out.println("ENTER A STRING"); Scanner sc = new
		 * Scanner(System.in); String str =sc.nextLine(); char ch[]= str.toCharArray();
		 * for (int i =ch.length-1; i >=0; i--) {
		 * 
		 * 
		 * result +=ch[i]; } System.out.println("REVERSE STRING IS : "+result);
		 * 
		 */
	StringBuffer b =new StringBuffer("learn code");
	System.out.println(b.reverse());
	///
	 
	
	
	
	
	int l;
	String r = "hello how are you";
	String r2="";
	l=r.length();
	for (int i = l-1; i>=0; i--) {
		r2=r2+r.charAt(i);
	}
	
	System.out.println(r2);
		
	}
	
	}











//array stored fixed value . 
 //there are two ways we can create string in java
// ( 1 - with using new operator
// 2) without using new operator.
///literal is a source code representation of a fixed value. it is constant . their value will never change
// string pool is a storage area of java heap
//string builder in java is class used to create a mutable.  modifiable succession of characters.
//string buffer a thread safe mutable sequence of characters.
//string is non dataType because theirSize is not fixed.  it is a set of characters that can also contain a numbers and spaces.