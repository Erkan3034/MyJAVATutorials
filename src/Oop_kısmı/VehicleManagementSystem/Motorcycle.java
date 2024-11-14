package Oop_kısmı.VehicleManagementSystem;

public class Motorcycle extends Vehicle implements FuelConsumption {

	private double _fuelEfficiency;

	public Motorcycle(String brand, String model, int year, double fuelEfficiency) {
		super(brand, model, year);
		_fuelEfficiency = fuelEfficiency;
	}

	@Override
	public void startengine() {
		System.out.println("MOTORCYCLE engine started !");

	}

	@Override
	public double calculateFuelConsumption(double distance) {

		return (distance * _fuelEfficiency) / 100;
	}

}
