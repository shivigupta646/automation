package ArrayPractice;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int abc= 0;
		int a[]= {6,2,4,56,7,43,76,23,45};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					abc=a[i];
					a[i]=a[j];
					a[j]=abc;
				}
			}
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}

}
