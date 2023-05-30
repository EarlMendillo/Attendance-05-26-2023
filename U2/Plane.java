package U2;

//Subclass - Plane
public class Plane extends Vehicle {
	protected int wingspan;

	public Plane(int speed, String color, double price, int wingspan) {
		super(speed, color, price);
		this.wingspan = wingspan;
	}

	public void fly() {
		System.out.println("Plane is flying.");
	}
}
