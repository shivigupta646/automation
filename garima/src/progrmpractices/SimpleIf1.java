package progrmpractices;

public class SimpleIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleIfEx2();
		
		int n ;
		
		n = 230;
		
		if( n > 100 ) {
			System.out.println(" the number is greater than 100. ");
		}
	}
    
	public static void simpleIfEx2() {
		 int a = 10;
		 int b = 20;
		 
		 if (a>b) {
			 System.out.println("a is greater than b ");
		 }
		 
		 if (a<b) {
			 System.out.println("a is less than b ");
		 }
		  if (a==b) {
			  System.out.println("a is equal to b.");
		  }
	}
}
