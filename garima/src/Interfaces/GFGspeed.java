package Interfaces;

public class GFGspeed {

	public static void main(String[] args) {
		
		
		Bycycles cycle = new Bycycles();
		cycle.applyBreaks(4);
		cycle.applyBreaks(6);
		cycle.Breaks(43, 8);
		cycle.ChangeGear(3);
		cycle.Change(44, 7);
		
		System.out.println("cycle present state :");
		cycle.printStates();
		
		Bike bike= new Bike();
		bike.ChangeGear(8);
		bike.applyBreaks(4);
		bike.speedUp(43);
		
		System.out.println("Bike present state :");
		cycle.printStates();
	}

}
