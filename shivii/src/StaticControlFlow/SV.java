package StaticControlFlow;

public class SV {
  
	/*
	 * static boolean i ;;
	 * 
	 * static { System.out.println(i); } static { i=true; }
	 * 
	 * static { System.out.println(i); }
	 */ 
	
///1.on the time of class loading which a piece of code we want to run we 
	//put in the block.
//rule 1. compiler 1st do identification.Identify from top to bottom.
	//only identify a static thing.
//	main method always execute in the last 
	//method is not call by own but block is call by own.
	//block also call when class loading is make.
	//main method always call by JVM
	//method always call by main method.
	//when class loading start then blocks run with that.
	//variable, block ,initialization,run when class loading is start.
	//1st identification, 2nd initialization/execution, 3rd calling of mainmethod
	//rule 2. initialization ,execution form top to bottom.
	//rule 3. execution or main method.method is part of execution.
	
	static int i=14;//.....[1]...int [7] i =10
	static {//...[2]..static block{}  [8] execute 
		System.out.println("1st static block");//...[11]print
		method1(21,32);//....[9]execution
		method2();
	}
	public static void main(String[] args) {//...[3]main method(string{})
		// TODO Auto-generated method stub
  
		method2();
		method1(21,32);//...[14]
       System.out.println("i know about you");//...[10]  j=0 ..[15]
       
       }

	
	public static void method1(int b,int a) {//....[4]method1
		System.out.println(a+b);
		System.out.println(h);
		System.out.println(f);
		System.out.println(d);
	}
	static {//...[5] static{}....[12]execute print
	 System.out.println("2nd static block");
	}
	
	static int h=43;//...[6]int j....[13]int j=43
	
	public static void method2() {
		System.out.println(g);
	}
		static {
		System.out.println("hiii");
		}
	static int g=253;	
		 
        static {
        	System.out.println("hello");
        } 
       
        static int f=321;
        
        static {
        	System.out.println("hey");
        }
        	static int d=23;
         }

       







