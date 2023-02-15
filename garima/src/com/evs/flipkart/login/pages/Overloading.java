package com.evs.flipkart.login.pages;

public class Overloading {
public static void main(String[] args) {
	shivi(3);
	shivi(2,"hello");
	shivi(6,8,5);
	shivi(3,5)	;
	shivi();
	
}

public static void shivi(int a) {
	System.out.println("hi I am  shivi int a");
}


public static void shivi(int a , int b) {
	System.out.println("Hi I am shivi int a and int a");
}

public static void shivi(int b, String qwe ) {
	System.out.println(" Hi I am shivi in b String qwe");
}

public static void shivi() {
	System.out.println(" I am shivi without any parameter");
}
 
public static void shivi(int a, int b , int c) {
	System.out.println("i am shivi int a int b int c");
	
}
}
