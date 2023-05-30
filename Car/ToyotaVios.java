package Car;

//Subclass - Toyota VIOS
public class ToyotaVios extends Car {
	String tireType;

	public ToyotaVios(int speed, String color, double price, String tireType) {
		super(speed, color, price);
		this.tireType = tireType;
	}

	@Override
	public void drive() {
		System.out.println("Toyota VIOS is smoothly driving on the road.");
	}
}
