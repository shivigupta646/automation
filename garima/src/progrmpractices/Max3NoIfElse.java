package progrmpractices;

public class Max3NoIfElse {

	public static void main(String[] args) {
		 int a, b , c , max;
		 
		 a = 23;
		 b = 93;
		 c = 10;
		 
		 if( a > b ) {
			  if( a > c)
				 max = a;
			  else
				 max = c;
			  }
		 else {
			  if( b> c )
				 max = b;
			 else
				 max = c;
			 
			  may();
			  
		 }
    System.out.println("\nMaximum : " + max );
	}

	public static void may() {
		
 int a, b , c , mix;
		 
		 a = 27;
		 b = 65;
		 c = 70;
		 
		 if( a < b ) {
			  if( a < c)
				 mix = a;
			  else
				 mix = c;
			  }
		 else {
			  if( b < c )
				 mix = b;
			 else
				 mix = c;
			 
		 }
    System.out.println("\nMinimum : " + mix );
	}
	}
