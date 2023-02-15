package CollectionPractice;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice{

	public static void main(String[] args) {
		
		ArrayList<Integer>  list   =new ArrayList<Integer>();
		
		//add elements
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	    System.out.println(list);
		 
	   	 //get elements
		 int element = list.get(3);
		 System.out.println(element);
		 
		 //add element in between
		list.add(1 ,1);
		 System.out.println(list);
		 
		 //set element
		 list.set(4, 5);
		 System.out.println(list);
		 
		 //remove/delete ellemet
		 list.remove(2);
		 System.out.println(list);
			 
		 //size elemets
		int size = list.size();
		System.out.println(size);
		
		 //loops
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			
		}
		System.out.println();
		
		//sorting
		Collections.sort(list);
		System.out.println(list);
		
		//removeall element
		
		  list.removeAll(list); System.out.println(list);
		 
	}

}
//size of AL is variable
//we can store primitive and and object in arrays but we can store only object in AL.
//MEthod of arraylist
//1. add, 2. remove/delete, 3.get, 4.modify, 5.itrate/operation       ,