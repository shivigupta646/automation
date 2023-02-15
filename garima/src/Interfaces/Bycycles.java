package Interfaces;

public class Bycycles implements vehicle ,Car{

	int speed;
	int gear;
	@Override
	public void ChangeGear(int newGear) {
		
		 gear = newGear;
	}
	@Override
	public void speedUp(int increment) {
	 	 speed = speed + increment;
	}
	@Override
	public void applyBreaks(int decrement) {
	  	 speed = speed - decrement;
		
	}
	
	
	public void printStates() {
	 System.out.println("speed: " +speed + "gear: " + gear);
	}
	@Override
	public void Change(int b, double c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speeddown(int b, float r) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Breaks(int b, int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveslow(int b, short h) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void slowdown(int b, int c, long s) {
		// TODO Auto-generated method stub
		
	}

}
