 package ArrayPractice;

public class ArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		int a[]= {1,7,5,9,2,12,53,25};
		
		for(int i = 0; i<a.length; i++) {
			for(int j= i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] =  temp;
					
				}
		
		}
			System.out.print(a[i] +"  ");
		}
		System.out.println();
		}}