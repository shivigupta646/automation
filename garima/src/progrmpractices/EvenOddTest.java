package progrmpractices;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      mr();
      mr1();
      mr2(); 
      
      
      
		int n;
		 n = 23;
		 
		 if ( n % 2 == 0 )
			 System.out.println("Number " + n + " is Even Number." );
		 
		 else {
			 System.out.println("Number " + n + " is Odd Number." );
		 }
	}
  
	
	public static void mr() {
		  
		int y;
		y = 42;
		 if ( y % 2 == 0 )
			 System.out.println(" Number " + y + " is even Number." );
		 
		 else {
			 System.out.println("Number " + y + " is Odd Number.");
		 }
	}

	public static void mr1() {
		  
		int h;
		h = 65;
		 if ( h % 2 == 0 )
			 System.out.println(" Number " + h + " is even Number." );
		 
		 else {
			 System.out.println("Number " + h + " is Odd Number.");
		 }
	}
    public static void mr2() {
	  
	int j;
	j = 626;
	 if ( j % 2 == 0 )
		 System.out.println(" Number " + j + " is even Number." );
	 
	 else {
		 System.out.println("Number " + j + " is Odd Number.");
	 }
}}