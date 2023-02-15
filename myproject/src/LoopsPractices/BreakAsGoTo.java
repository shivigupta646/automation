package LoopsPractices;
 // Label block and break
public class BreakAsGoTo {

	public static void main(String[] args) {

		aBlock:{
			bBlock:{
				cBlock:{
					System.out.println("Before using break");
					if(true) {
						break bBlock;
						
					}
					System.out.println("This will never execute");
					
				}
				System.out.println("THis is never execute");
			}
			System.out.println("THis will be execute");
		}
	}}
