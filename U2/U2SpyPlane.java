package U2;

//Subclass - U-2 Spy Plane
public class U2SpyPlane extends Plane {
	public U2SpyPlane(int speed, String color, double price, int wingspan) {
		super(speed, color, price, wingspan);
	}

	// Method overriding
	@Override
	public void fly() {
		System.out.println("U-2 Spy Plane is performing a spy mission.");
	}
}
