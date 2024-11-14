package Oop_kısmı.VehicleManagementSystem;

public class Car extends Vehicle implements FuelConsumption {

	private double _fuelEfficiency;

	public Car(String brand, String model, int year, double fuelEfficiency) {
		super(brand, model, year);
		_fuelEfficiency = fuelEfficiency;
	}

	@Override
	public double calculateFuelConsumption(double distance) {
		return (distance * _fuelEfficiency) / 100;

	}

	@Override
	public void startengine() {
		System.out.println("CAR engine start !");

	}

}
