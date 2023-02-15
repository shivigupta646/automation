package LoopsPractices;

// sum of numbers using command line...
public class ArguSum {

	public static void main(String[] args) {

		int s = 0, len;
		len = args.length;
		
		for(int i =0 ; i <len ; i++) {
			int x = Integer.parseInt(args[ i ]);
			s = s + x;
			
		}
		System.out.println( " Sum of command - Line Arguments ::: " + s );
	}

}
