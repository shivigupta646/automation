package ArrayStarting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Arraylists {

	public static void main(String[] args) {
		 String str="hello";
		 char c[]=str.toCharArray();
		 for (int i = c.length-1; i >=0; i--) {
			System.out.print(c[i]);
			
			}
		 
		 ArrayList<Integer> arl=new ArrayList<Integer>();
		 arl.add(20);
		 arl.add(2);
		 arl.add(27);
		 arl.add(25);
		 arl.add(22);
		 arl.add(29);
		 System.out.println(arl);
		  System.out.println(arl.size());
		  
			
			  ArrayList<Integer> ar=new ArrayList<Integer>();
			  ar.add(4);
			  ar.add(6);
			  ar.add(7);
			  System.out.println(ar);
			  System.out.println(ar.size());
			  
			  
			
	//get element
		int element = arl.get(2);
		System.out.println(element);
  
		arl.set(2, 4);
		System.out.println(arl);
		
		arl.remove(3);
		System.out.println(arl);
		
		int size = arl.size();
		System.out.println(size);
		
		arl.add(3, 4);
		System.out.println(arl);
		
		for (int i = 0; i < arl.size(); i++) {
			System.out.print(arl.get(i));
		}
		System.out.println();
		
		                                                                                                           
		
	 }
		}













//list is a interface
//arraylist is gloable in nature. it is also elastic.
