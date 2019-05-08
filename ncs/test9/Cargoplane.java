package ncs.test9;

public class Cargoplane extends Plane{
	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void flight(int distance) {
		// TODO Auto-generated method stub
		super.setFuelSize(super.getFuelSize()-distance*5);
	}
}
