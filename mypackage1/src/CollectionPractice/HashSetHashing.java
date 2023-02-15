 package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetHashing {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		//insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		System.out.println(set);
		
		//search-contains
		if(set.contains(1)) {
			System.out.println(" set contains 1");
		}
		if(!set.contains(7)) {
			System.out.println(" set doesn't contains ");
		}
		
		//remove
		set.remove(1);
		if(set.contains(1));
		System.out.println(" doesn't contains 1 - we deleted 1 ");
		
		
		//size
		System.out.println("size of set is : " + set.size());
		
		//all elemnets
		System.out.println(set);
		
		//itrator
		
		  Iterator it = set.iterator();
		  
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		 
		//hashnext; next
		}
	}


 //hashset is important data structure b/c of its time complexsity