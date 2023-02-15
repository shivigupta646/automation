package progrmpractices;

public class Days {

	public static void main(String[] args) {
		
		int days, years, months, weeks;
		 
		days = 1050;
		
		years = days / 365;
		days = days % 365;
		months = days / 30;
		days = days % 30;
		weeks = days / 7;
		days = days  % 7;
		
		
		System.out.println("\n years = " + years );
		System.out.println("\n months=" + months );
        System.out.println("\n weeks = " + weeks );
        System.out.println("\n days  = " + days );
	}
}