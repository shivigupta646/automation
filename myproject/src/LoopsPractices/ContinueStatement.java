package LoopsPractices;

public class ContinueStatement {
  //continue statement example
	public static void main(String[] args) {

		for(int i = 0 ; i< 10; i++) {
			if(i % 2 == 0) {
				continue;
				//if condition satisfied then here loop skip below part
			}
			System.out.println(i);
		}
	}

}
