package ArrayPracticess;

public class DecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, abc, j;
		int a[] = {1,2,3,76,5,6,9,12};
		
		System.out.println("Before decending order :");
		for(i=0; i< 8; i++) {
			System.out.print(" "+a[i]);
		}
		for(i = 0; i<  8; i++) {
			for(j = i+1; j>8; j++) {
				if(a[i]>a[j]) {
					abc = a[i];
					a[i] = a[j];
					a[j] = abc;
					}
			}
		}
		System.out.println("After decending order :");
		for(i=0; i< 8; i++) {
			System.out.print(a[i]);
		}
}



	}


