package mypackage1;

public class ShampleClass {

	public static void main(String[] args) {
	
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=7; j++) {
				System.out.print("0 ");
			}
			System.out.println();
			
		}
		
		for(int i=0; i<=6; i++) {
			for(int j=i; j<=0; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=6; j++) {
				System.out.print(" 0 ");
			}
			System.out.println();
			}
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j<=1; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=5; j++) {
				System.out.print(" 0 ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=5; j<=1; j++) {
				System.out.print(" ");
			}
			for( int j=1; j<=i; j++) {
				System.out.print(" 0 ");
			}
			System.out.println();
		}
		
		for(int i=0; i<=6; i++) {
			for(int j=6; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(" 0 ");
			}
			System.out.println();
		}
		
		for(int g=0; g<=7; g++) {
			for(int j=g; j<=7; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=g; j++) {
				System.out.print("0 ");
			}
			
			System.out.println();
		}
		
	}

	}
