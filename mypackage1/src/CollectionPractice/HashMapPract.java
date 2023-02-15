package CollectionPractice;

import java.util.HashMap;

public class HashMapPract {

	public static void main(String[] args) {

		
		HashMap<String, Integer> map= new HashMap<>();
		
		//Insertion order
		map.put("India", 120);
		map.put("china", 150);
		map.put("pakistan", 50);
		map.put("America", 30);
		map.put("UK", 54);
	 	System.out.println(map);
	 	
	 	map.put("China", 150);
	 	System.out.println(map);
	 	
	 	//Search Operation
	 	if(map.containsKey("China")) {
	 		System.out.println(" key is present in tha map ");
	 	}else {
	 		System.out.println(" Key is not present in the map ");
	 	}
	 	
	
	if(map.containsKey("Indonesia")) {
 		System.out.println(" key is present in tha map ");
 	}else {
 		System.out.println(" Key is not present in the map ");
 	}
 	
	
	System.out.println(map.get("China"));//Keys exists
	System.out.println(map.get("Indonasia"));//keys doesn't exists
	

}

}
