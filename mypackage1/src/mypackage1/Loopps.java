package mypackage1;

public class Loopps {

	public static void main(String[] args) {
	 
		for(int i=0; i<=4; i++) {
			for (int j=4; j<=4; j++) {
				System.out.print("0");
			}
			System.out.println();
		}

		for(int i=0; i<=5; i++) {
			for(int j=5; j<=i; j++) {
				System.out.print("");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("0"     +"0");
			}
			System.out.println();
		} 
		for(int i=0; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("");
			}
			for(int j=i; j<=5; j++) {
				System.out.print("0"     +"0");
			}
			System.out.println();
		}
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j<=i; j++) {
				System.out.print("");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("0"    +"0");
			}
		System.out.println();
		}
		for(int i=0; i<=5; i++) {
			for(int j=5; j<=0; j++) {
				System.out.print(" ");
			}
			for( int j=i; j<=5; j++) {
				System.out.print("0"   +"0");
			}
			System.out.println();
		}
		for(int i=0; i<=5; i++) {
			for (int j=5; j<=5; j++) {
				System.out.print("0");
			}
			System.out.println();
		}
		  
		for(int i=0; i<=3; i++) {
			for(int j=i; j<=3; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	    for(int i=0; i<=3; i++) {                                               	
	    	for(int j=0; j<=i; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
    
   for(int i=0; i<=5; i++) {
	   for(int j=0; j<=i; j++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
      for(int i=0; i<=5; i++) {
    	  for(int j=i; j<=5; j++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      
      for(int i=1; i<=6; i++) {
    	  for(int p=6; p<=6; p++) {
    		  System.out.print("0");
    	  }
    	  System.out.println();
      }
	}

}
