package ArrayPractice;

public class BubbleSort {

	public static void main(String[] args) {
		
		 int i, j, t;
		 int a[]= {40, 20, 50, 10, 30};
		System.out.print( "\n Unorted Numbers are = " );
		for (int i1= 0; i1< 5; i1++) {
			System.out.print( a[ i1 ] + "  " );
			
		}
		for (int i1 = 0; i1 < 5-1; i1++) {
			for(j=0; j<(5-1-i1); j++ ) {
				if( a[ j ] > a[j+1] ) {
					t = a[ j ];
					a[ j ] = a[j+1];
					a[j+1] = t;
					
				}
			}
			}
		
		System.out.print( "\n Sorted Numbers are = " );
		for(i=0 ; i<5 ; i++) {
			System.out.print( a[ i ] + "  " );
		}
	}

}
