package ArrayPractice;

public class Duplicateelement {

	public static void main(String[] args) {
		
		int A[]= new int [] {6, 7, 5, 4 , 4,3 ,2 , 1, 1};
		
    for(int i=0; i<A.length; i++) {
    	for(int j=i+1;j<A.length;j++) {
    		if(A[i]==A[j]) {
    			System.out.println("Array has duplicate elements :"+A[i]);
    			return;
    		}
    	}
    }
    System.out.println("Array has no duplicate elements");
	}

}
