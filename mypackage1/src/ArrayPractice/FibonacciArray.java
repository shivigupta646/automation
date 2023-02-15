package ArrayPractice;

public class FibonacciArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, i;
		int[]a=new int[20];
		n=10;
		a[0]=0;
		a[1]=1;
		for(i=2 ; i<n; i++) {
			a[ i ] =a[ i- 1] + a[ i -2];
			
		}
		for(i=0 ; i<n ; i++) {
			System.out.print( "  " + a[ i ] );
		}
	}

}
