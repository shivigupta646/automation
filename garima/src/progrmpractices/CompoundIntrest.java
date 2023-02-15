package progrmpractices;

public class CompoundIntrest {

	public static void main(String[] args) {
		
		
		double a ,b , d, n ,ci;
		  
		
		b=10000;
		d=100;
		n=30;
		
		a = b * Math.pow((1 + (d / 1000.0)), n);
		
		ci = a - b;
		
		System.out.println(" Account = " + a );
		System.out.println(" Component intrest = " + ci );
	}
     
	
	
}
