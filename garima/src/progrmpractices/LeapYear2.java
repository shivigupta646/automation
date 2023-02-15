package progrmpractices;

public class LeapYear2 {

	public static void main(String[] args) {
		rum();
		ruu();
		
		int y;
		
		y = 2016;
		
		if ( y % 100 == 0 ) {
			if( y % 400 == 0 )
				System.out.println(" It is a LEAP year. ");
			else
				System.out.println( " it is NOT a LEAP year." );
		}
		else if( y % 4 == 0 )
			System.out.println(" it is a LEAP year ");
		else
			System.out.println( " it is NOT a LEAP year.");
		}

	public static void rum() {
	int z;
	
	z = 2013;
	
	if ( z % 100 == 0 ) {
		if( z % 400 == 0 )
			System.out.println(" It is a LEAP year. ");
		else
			System.out.println( " it is NOT a LEAP year." );
	}
	else if( z % 4 == 0 )
		System.out.println(" it is a LEAP year ");
	else
		System.out.println( " it is NOT a LEAP year.");
	}
	
	public static void ruu() {
	int k;
	
	k = 1979;
	
	if ( k % 100 == 0 ) {
		if( k % 400 == 0 )
			System.out.println(" It is a LEAP year. ");
		else
			System.out.println( " it is NOT a LEAP year." );
	}
	else if( k % 4 == 0 )
		System.out.println(" it is a LEAP year ");
	else
		System.out.println( " it is NOT a LEAP year.");
	}
	}

