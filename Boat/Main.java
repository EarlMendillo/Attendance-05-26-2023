package Boat;

//Main class
public class Main {
	public static void main(String[] args) {
		// Create a Fandango Yacht object
		FandangoYacht yacht = new FandangoYacht(30, "White", 500000, "Red");

		// Accessing properties and methods
		System.out.println("Fandango Yacht");
		System.out.println("Speed: " + yacht.speed);
		System.out.println("Color: " + yacht.color);
		System.out.println("Price: " + yacht.price);
		System.out.println("Main Sail Color: " + yacht.mainSailColor);
		yacht.floatBoat(); // This will call the overridden floatBoat() method in FandangoYacht class

		// Invoke stop() method from the base class
		yacht.stop();
	}
}
