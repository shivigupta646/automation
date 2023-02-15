package progrmpractices;

public class SimpleConversionRupes {

	public static void main(String[] args) {
		
		m1();
		
		double v=56.50;
		int a =(int) v;
		double p=(v-a)*100;
		System.out.println("Rs : "+a);
		System.out.println("paisa :" +(int)p);
	}
     
	
	public static void m1() {
		double a=76.43;
		int x =(int) a;
		double h=(a-x)*100;
		System.out.println("Rs : "+x);
		System.out.println("paisa : " +(int)h);
	}
	
	
	
	
}
