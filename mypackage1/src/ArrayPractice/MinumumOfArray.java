package ArrayPractice;

public class MinumumOfArray {

	public static void main(String[] args) {
		
		int i, min;
		int a[]= {10, 60, 5, 40, 50};
		min=a[0];
		for(i=0; i<5; i++) {
			if(min>a[i]) {
				min=a[i];
				
			}
		}
		System.out.println("minimum : "+min);
	}

}
