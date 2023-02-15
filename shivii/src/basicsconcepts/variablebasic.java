package basicsconcepts;

import shivii.abcd;
import shivii.concepts;
import shivii.hello;
import shivii.lovely;

public class variablebasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		addition(1234,5432,123);
		addition(8765,4351,4352);
		
		subtract(23,43);
		subtract(12,32);
		 
		sub(4321,2345);
		sub(5432,1234);
		
		multiple(1234,3421);
		multiple(2341,6543);
		
		abcd.july();
		lovely.calculatorsalary();
		concepts.main(args);
		hello.sweat();
		
		devide(3421,32);
		devide(5432,43); 
		
		
		for(int x=1; x<=10; x++) {
			System.out.println(x+"x"+x+"="+(x*x));
		}

		for(int i=2; i<=20; i++) {
			System.out.println(i+"*"+i+"*"+i+"="+(i*i*i));
		}
		
		
	}
	

	
	
	public static void addition(int x,int y,int z) {
		
		
	int p=x+y+z;
	System.out.println(p);
	
	}

	
	public static void subtract(int i,int j) {
		int d=i+j;
		System.out.println(d);
	}
	
	
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	
	public static void multiple(int p,int q) {
		
		int r=p*q;
		System.out.println(r);
	}
	
	
	
	public static void devide(int q,int r) {
		int p=q%r;
		System.out.println(p);
		
	}
	
	
	
	
	
	
	
	
}
