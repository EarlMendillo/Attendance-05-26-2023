package U2;

//Main class
public class Main {
	public static void main(String[] args) {
		// Create a U-2 Spy Plane object
		// Create a U-2 Spy Plane object
		U2SpyPlane u2 = new U2SpyPlane(1000, "Black", 1000000, 50);

		// Accessing properties and methods
		System.out.println("U-2 Spy Plane");
		System.out.println("Speed: " + u2.speed);
		System.out.println("Color: " + u2.color);
		System.out.println("Price: " + u2.price);
		System.out.println("Wingspan: " + u2.wingspan);
		u2.fly(); // This will call the overridden fly() method in U2SpyPlane class

		// Invoke stop() method from the base class
		u2.stop();
	}
}
