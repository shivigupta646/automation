package ArrayStarting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ab = new ArrayList<String>();
		ab.add("shivansh");
		ab.add("sweta");
		ab.add("subhu");
		ab.add("shivanvi");
		ab.add("Manvi");
		ab.add("shivi");
		System.out.println(ab);
		                                                                            
	String element = ab.get(5);
	System.out.println(element);
	
	ab.add(0, "shivanvi");
	System.out.println(ab);
	
	ab.remove(3);
	System.out.println(ab);
	
	
	  int size = ab.size();
	  System.out.println(size);
	  
	  
	  for (int i = 0; i < ab.size(); i++) {
		System.out.print(ab.get(i));
	  }
	  System.out.println();
		
		Collections.sort(ab);
		System.out.println(ab);
		
		
	}
	  
	 
	}

//LITERAL---it is a source code representation of a fixed value.it can be assigned to any primitive type variable
//ARRAYS---it is a container object that holds a fixed no. of values of single type.and fixed in size. 
////arrays cannot accepts null.we can store only one datatype either int, string, char collection of similar type of data
//int [] ab= new int[4];
//ARRAYLIST---size can be increased or decreased dynamically.it can accepts null.they are not strongly typed.
////we can store different datatypes variable.belongs to system collection namespace.
// ArrayList <string> st=new ArrayList<string>();
//STRING-- a sequence of character it is immutable and tread-safe
//STRING IS CALLED STRING__they are made up of a sequence, or string, of characters
//String str= new string();-----str is a heap area
//string str="shivi";----it is string constant pool.
//STRINGBUFFER----it is a thread-safe mutable sequence of characters.it is stored in the heap area.
///string buffer stb= new string buffer();
//string is immutable because of the security and class loading.
//STRING BUILDER---IT ISN.t thread-safe mutable sequence of characters. modifiable succession of characters.
////StringBuilder sb= new StringBuilder ();
//STRING POOL--it is a storage area in java heap. /
///STRING CONSTANT POOL=---it is an area in heap memory where java store literal string values.
//HEAP---it is a area of memory used to run time operations.
//MAIN METHOD IS STATIC WHY--it is directly called by JVM without creating an object of the class .
//ACCESS MODIFIERS--they are keywords that can be used to control the visibility of method,and construtor in class
////4 TYPES ARE 1. PUBLIC, 2. PRIVATE, 3. DEAFAULT, 4 .PROTECTED.
//PRIVATE MODIFIER---specifies that the member can only be accessed in its own class.
//PUBLIC MODIFIER--that all code can access class,field,constructor,regardless of where accessing code is located.
//PROTECTED--it specifies that the member can only be accessed within its own package.
//DEAFAULT--all members are visible within the same package but aren't accessible from other packages. also package private.
//DROPDOWN--it is identified with select tagname and its options are represented with the tagname option.
///// SELENIUM WEBDRIVER IS USED FOR SELECTING AND DISELECTING OPTION OF DROPDOWN.
//1.SELECT BY VISIBLE TEXT--this method is most commonly used in dropdown.
//2.SELECT BY INDEX--this method takes the index of the option to select in the dropdown.
//3.SELECT BY VALUE---
///DROPDOWN IS REPRESENTED BY <SELECT> TAG

///WEBDRIVER----it is an interface that is available in selenium jar files.
///DRIVER----it is webdriver reference variable.
///SELINIUN WEBDRIVER IS PLATFORM INDEPENDENT.
///XPATH--a technique in selenium to navigate through the HTML structure of a page.
///WEBELEMENT---it represents as HTML element
///FINDELEMENTS---the list of web element that match the locator value it returns only single web element.
///FINDELEMNT--this method uniquely finds a web element on the web page.
///this method  used to identify an element which matches with the xpath locator passed parameter.

