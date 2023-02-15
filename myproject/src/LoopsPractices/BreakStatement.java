package LoopsPractices;
 //Break statement in for loop example
public class BreakStatement {

	public static void main(String[] args) {

		for(int i = 0; i< 10; i++) {
			System.out.println(i);
			if(i==9) {
				break;
			}
		}
		System.out.println(" loop over");
	}

}
