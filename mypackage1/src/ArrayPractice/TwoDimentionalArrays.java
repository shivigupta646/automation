package ArrayPractice;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a[][]= new int [2][3];
		int i, j, x = 1;
		for (int k = 0; k < 2; k++) {
			for ( j = 0; j < 3; j++) {
				a[ k ][ j ] = x;
				x++;
			}
				
			}
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				System.out.print(a[ i ][ j ] + "   ");
				System.out.println();
			}
		}
		}
	}


