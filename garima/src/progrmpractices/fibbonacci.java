 package progrmpractices;

public class fibbonacci {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int c;
		System.out.print(a + " " + b);
		for (double i = 1; i <= 5; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
	

}
