package Car;

//Subclass - Car
public class Car extends Vehicle {
	public Car(int speed, String color, double price) {
		super(speed, color, price);
	}

	public void drive() {
		System.out.println("Car is being driven.");
	}
}
