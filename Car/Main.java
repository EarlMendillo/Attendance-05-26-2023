package Car;

//Main class
public class Main {
	public static void main(String[] args) {
		// Create a Toyota VIOS object
		ToyotaVios vios = new ToyotaVios(120, "Silver", 30000, "All-season");

		// Accessing properties and methods
		System.out.println("Toyota VIOS");
		System.out.println("Speed: " + vios.speed);
		System.out.println("Color: " + vios.color);
		System.out.println("Price: " + vios.price);
		System.out.println("Tire Type: " + vios.tireType);
		vios.drive(); // This will call the overridden drive() method in ToyotaVios class

		// Invoke stop() method from the base class
		vios.stop();
	}
}
