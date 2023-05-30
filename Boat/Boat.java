package Boat;

//Subclass - Boat
public class Boat extends Vehicle {
	public Boat(int speed, String color, double price) {
		super(speed, color, price);
	}

	public void floatBoat() {
		System.out.println("The boat is floating.");
	}
}
