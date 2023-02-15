package CollectionPractice;

import java.util.LinkedList;

public class linklistl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addFirst("this");
		list.addFirst("list");
		System.out.println(list);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ " -> ");
		}
		
		System.out.println("null");
		
		list.remove(3);
		System.out.println(list);
		
	
		
		
		
		
	}

}
