package gypsy;

public class ReturnParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		///double
	///	1.weather parameter is available or not.
		////if available then you ill have to pass.
		///if not then don't pass
	///.2. check numbers of parameters,pass parameters 	value according to your parameter.
		//3. check type of parameter and pass parameter values according to parameter types.
	//4. check order or sequence of parameters	
		
		
	//squaremethod(false ,57);
	//	squaremethod(true,342);
		//squaremethod(true ,34);
		
		 //equations(3546,87675,3142);
		// equations(65342,8765,1663);
	//	equations(20000,53655,83675);
	//	equations(4232,7652,1234);
		
	//	 int a=20000;
//		int y = equated(a,30000,2345);
	// System.out.println(y);
	
		 double totalequated = equated(7000.3,5600,700);
		double taxvalue=totalequated*10/100;
		System.out.println(taxvalue);
		double totalvalue=totalequated-taxvalue;
		System.out.println(totalvalue);
		
		// int t = equated(30000,7000,6799);
		// System.out.println(t);
		
	}

//	public static void squaremethod(boolean s,int r) {
	//	System.out.println(s);
		
		
	//	int square=(s*s)+(r*r)+(2*s*r);
	//	System.out.println(square);
	//}
	public static void equations(int basic,int hra ,int pfund) {
		
	
	int grossvalue =(basic+hra+pfund) ;
	System.out.println(grossvalue);
	}
	
	public static double equated(double basic,double hra,double pfund) {
		double totalequated =(basic+hra+pfund);
		
	//int netsalary=totalequated-taxvalue;
		//int taxvalue=totalequated*tax/100;
		
		// `System.out.println(totalequated);
		
		return totalequated;
	}
	
		
}