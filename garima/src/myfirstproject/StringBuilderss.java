package myfirstproject;

public class StringBuilderss {

	public static void main(String[] args) {
		 
		StringBuilder sb = new StringBuilder ("ShiviGUpta");
		System.out.println(sb);

		System.out.println(sb.charAt(2));
		System.out.println(sb.charAt(5));
		System.out.println(sb.charAt(3+4));
		
		//set char at index
		
				sb.setCharAt(3, 'd');
				System.out.println(sb);
				
		//insert index		
				sb.insert(5, 'a');
				System.out.println(sb);
				
				
				  sb.insert(0, 'f');
				  System.out.println(sb);
				  
				  ///delete the extra 'f'
				  sb.delete(0, 1);
				  System.out.println(sb);
				  
				  sb.delete(2, 4);
				  System.out.println(sb);
				  
				  //append........
				StringBuilder sb1 = new StringBuilder ("H");	
				sb1.append('e');
				sb1.append('l');
				sb1.append('l');
				sb1.append('o');
				System.out.println(sb1);
				System.out.println(sb1.length());
				
				 
				StringBuilder sb2 = new StringBuilder ("Shivi");
				for (int i = 0; i < sb2.length()/2; i++) {
					int front= i;
					int back = sb2.length()-1-i;
					
				char fc = sb2.charAt(front)	;
				char bc = sb2.charAt(back);
				
				sb2.setCharAt(front, bc);
				sb2.setCharAt(back, fc);
				}
				System.out.println(sb2);
				
					
					
				}
	}


