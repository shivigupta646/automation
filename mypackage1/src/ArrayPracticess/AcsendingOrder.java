package ArrayPracticess;

public class AcsendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, abc, j;
			int a[] = {1,2,73,54,5,6,9,12};
			
			
			for(i = 0; i<8; i++) {
				for(j = i+1; j<8; j++) {
					if(a[i]>a[j]) {
						abc = a[i];
						a[i] = a[j];
						a[j] = abc;
						}
		
	}

}
			System.out.print(" After acennding order :");
			for(i=0; i< 8; i++) {
				System.out.println(a[i]);
	}}

}
