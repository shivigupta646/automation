package myfirstproject;

public class Reversepra {

	public static void main(String[] args) {
		
		String a[] = new String[4];
		
			a[0] = "I";
			a[1] = "LOVE";
			a[2] = "MY";
			a[3] = "INDIA";
	
			for (int i = 0; i < a.length; i++) {
				if (i % 2==0) {
					System.out.print(a[i] + " ");
				}

				if (i % 2 !=0) {
					int l = a[i].length();
					String s = "";
					for (int j = l - 1; j >= 0; j--) {
						char ch = a[i].charAt(j);
						s=s + ch;
					}
					System.out.print(s +" ");

				}
		
			}	
}}