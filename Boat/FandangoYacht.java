package Boat;

//Subclass - Fandango Yacht
public class FandangoYacht extends Boat {
	String mainSailColor;

	public FandangoYacht(int speed, String color, double price, String mainSailColor) {
		super(speed, color, price);
		this.mainSailColor = mainSailColor;
	}

	@Override
	public void floatBoat() {
		System.out.println("The Fandango Yacht is floating gracefully.");
	}
}
