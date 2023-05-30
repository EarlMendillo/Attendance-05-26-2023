package Car;

//Base class - Vehicle
public class Vehicle {
	protected int speed;
	protected String color;
	protected double price;

	public Vehicle(int speed, String color, double price) {
		this.speed = speed;
		this.color = color;
		this.price = price;
	}

	public void stop() {
		System.out.println("Vehicle has stopped.");
	}
}
