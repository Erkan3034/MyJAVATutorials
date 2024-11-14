package Oop_kısmı.VehicleManagementSystem;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car("Dodge", "Challenger SRT", 2024, 15);

		Vehicle motorcycle = new Motorcycle("Kawasaki", "pulsar", 2021, 9);
		
		Vehicle truck = new Truck("Scania", "LONG", 2029, 12);

		car.displayInfo();
		car.startengine();
		System.out.println("Car fuel consumption for 100 km: "
				+ ((FuelConsumption) car).calculateFuelConsumption(100) + "liters");
		
		System.out.println("");
		
		motorcycle.displayInfo();
		motorcycle.startengine();
		System.out.println("Motorcycle fuel consumption for 100 km: "
				+ ((FuelConsumption) motorcycle).calculateFuelConsumption(100) + "liters");
		
		
		System.out.println("");
		
		truck.displayInfo();
		truck.startengine();
		System.out.println("Truck fuel consumption for 100 km: "
				+ ((FuelConsumption) truck).calculateFuelConsumption(100) + "liters");
	}

}
