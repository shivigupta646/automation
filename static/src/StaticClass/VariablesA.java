package StaticClass;

public class VariablesA {
    
	static int i=20;//.....static
	int a=10;//...........non static
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(i);
		i=20;
		System.out.println(i);
		
		VariablesA ab=new VariablesA();
		System.out.println(ab.a);
		ab. a =65;
		System.out.println(ab.a);
		
		VariablesA bb=new VariablesA();
		System.out.println(bb.a);
		bb. a=23;
		System.out.println(bb.a);
		
		
		VariablesA sn=new VariablesA();
		System.out.println(sn.a);
		sn.a=675;
		System.out.println(sn.a);
		System.out.println(i);
		System.out.println(i);
		
		sn.i=132;
		System.out.println(sn.i);
		
		
		sn.a=555;
		System.out.println(bb.a);
	
	
		int x = methodr ()*methodr();
		System.out.println(x);
	
}
		
		public static int methodr() {
			int result=i*i*i;
			return result;
			
		}
	}

//1 Static memory have only 1 space to kept.thatwhys it is erase value and write
//2 Non static memory have different type space.when new object start then it make
//new space then it find new value
//n

//
