package mypackage1;

public class Shampleclass2 {

	int i;
	static Shampleclass2  c2;
	public void method() {
		
	}
	Shampleclass2(){
		
	}
	
	
	public static void method2() {
		System.out.println("hello dear");
	}
	
	public static void main(String[] args) {
	   
		/*
		 * // Shampleclass2 c2=new Shampleclass2() ; System.out.println(c2);
		 * c2.method2(); System.out.println(c2); c2=null; System.out.println(c2); //
		 * Shampleclass2 sc2=new Shampleclass2(); // c2=new Shampleclass2();
		 * System.out.println(c2); c2.method2();
		 */
	  

	
//method,block,constructor,variable they are all member of class.
//with object and reference variable can not be load constructor
//constructor can be never call.when time of creation object 
//it is nothing but instance of class is object.
//jitne classs ke object bnayenge uthi copy milegi.vanished old copy.
//class is blue print of object it is alsso collection of method
//we access deafalt class when both class are in same packge 
//null is expectable for all class.

   for(int i=0; i<=6; i++ ) {
	   for(int j=i; j<=6; j++) {
		   System.out.print(" ");
	   }
	   for(int j=0; j<=i; j++) {
		   System.out.print("* ");
	   }
	   System.out.println();
   }

   for(int i=0;i<=6; i++) {
	   for(int j=0; j<=i; j++) {
		   System.out.print(" ");
	   }
	   for(int j=i; j<=6; j++) {
		   System.out.print("* ");
	   }
	   System.out.println();
   }
   
   for(int i=0; i<=6; i++) {
	   for(int j=0; j<=i; j++) {
		   System.out.print(" ");
	   }
	   for(int j=i; j<=6; j++) {
	   System.out.print("* ");
   }
   System.out.println();
  
}
   for(int i=0; i<=6; i++) {
	   for(int j=i; j<=6; j++) {
		   System.out.print(" ");
		    }
	   for(int j=0; j<=i; j++) {
		   System.out.print("* ");
	   }
		   System.out.println();
	   }
   }
}