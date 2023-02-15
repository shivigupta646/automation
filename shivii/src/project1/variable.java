package project1;

public class variable {
	/*
	 * static int a=5;
	 *//**
		* 
		*//*
			 * 
			 * public static void m1(int i) { a=i+a; i=2; i=3; i=10; i=25;
			 * 
			 * System.out.println(i); }
			 */

	
		// TODO Auto-generated method stub

		/*
		 * m1(1); a=10; //m1();i=12;
		 * 
		 * a=21; System.out.println(a);
		 * 
		 * } public static void m2() {
		 */
		public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}	
			for (int k = 0; k <= i; k++) {
				System.out.print("*"+" ");
			}
		
		    for(int l=0;l<=5-i;l++) {
		    	System.out.print("  ");
		    	
		    }
			for(int m=0; m<=i; m++) {
			System.out.print("*"+" ");
			}
		System.out.println();
		}
		for(int n=8;n>=1;n++) {
			for(int p=1; p<=n; p++) {
			System.out.print(" ");
			
		} 
		System.out.println();
		}
		
		for(int i=0;i<=5;i++ ) {
			for(int j=i; j<=0; j++) {
				System.out.print("*");
			}
			System.out.println();
}
		
		
		
		}}

