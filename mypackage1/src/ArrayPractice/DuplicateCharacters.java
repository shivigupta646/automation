package ArrayPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi I Am Shivi Gupta";
		String str1 = str.toLowerCase();
		
		System.out.println( " LowerCase String : " + str1 );
		/*
		 * StringBuilder sb = new StringBuilder ();
		 * 
		 * for (int i = 0; i < str1.length(); i++) { char ch = str1.charAt(i); int index
		 * =str1.indexOf(ch, i+1); if(index==-1) { sb.append(ch); } }
		 * System.out.println(sb);
		 */
		Set<Character> gg=new LinkedHashSet<Character>();
	for (int i = 0; i < str1.length(); i++) {
		
		char xyz = str1.charAt(i);
		gg.add(xyz);
		
	}
	Iterator<Character>abc = gg.iterator();
	while (abc.hasNext()== true) {
		System.out.print(abc.next());
		
	}
	}
     
}













