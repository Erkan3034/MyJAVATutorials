package Oop_kısmı.VehicleManagementSystem;

public class Truck extends Vehicle implements FuelConsumption {

	private double _fuelEfficiency;

	public Truck(String brand, String model, int year, double fuelEfficiency) {
		super(brand, model, year);
		_fuelEfficiency = fuelEfficiency;
	}

	@Override
	public double calculateFuelConsumption(double distance) {
		return (_fuelEfficiency * distance) / 100;
	}

	@Override
	public void startengine() {
		System.err.println("TRUCK engine started!");

	}

}
