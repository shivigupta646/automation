package Exceptionalhandling;

public class UncheckedExepctionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///AirthmeticExceptions
		int a=10;
		//System.out.println(a/0);
		
		//nullpointerExceptions
		String s=null;
		/* System.out.println(s.length()); */
		
		//NumberformatExceptions
		String str="abcdferfj";
		/*
		 * int i=Integer.parseInt(str); System.out.println(i);
		 */
		
		//ArrayIndexOfBoundExceptions
		int arr[]=new int[5];
		arr[10]=100;
		
	}

}
