package gypsy;

public class ReturnPolicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multimedia(2345,8765,9876);
		multimedia(23456,9876,9870);
		multimedia(23456,87654,987);
		multimedia(1234,8765,67890);
		multimedia(12345,9876,98765);
		
		
		char x='a';x-=32;
		System.out.println(x);
		
		char z='A';z+=32;
		System.out.println(z);
		
		char y='A';y+=32-5;
		System.out.println(y);
		
		char r='A';r+=32+15;
		System.out.println(r);
		
		char t='a';t-=32-18;
		System.out.println(t);
		
		char u='d';u-=32-30;
		System.out.println(u);
		
		char g='s';g-=32+2;
		System.out.println(g);
		
		for(int i=0;i<=100;i++) {
			System.out.println(i+i);
		}
		
		for(int i=0;i<=46;i++) {
			System.out.println(i);
		}
		
		for(int p=0;p<=58;p++) {
			System.out.println(p+'*'+p+'*'+p+'='+(p*p));
			
			}		
		
		for(int l=0;l<=58;l++) {
			System.out.println(2*l);
			}
		
		for(int f=0;f<=67;f++) {
			System.out.println(f);
		}
		for(int f=0;f<=354;f--) {
			System.out.println(1-f);
		}
		
		char j='k';j+=32;
		
		System.out.println(j);
		System.out.println();
		
		
		
		}
		
		
		
	
	

	
	
	   public static void multimedia(int a,int b,int c) {
		   
		  int totalmedia=a+b+c;
		  System.out.println(totalmedia);
		   
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
