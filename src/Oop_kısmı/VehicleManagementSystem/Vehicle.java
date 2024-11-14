package Oop_kısmı.VehicleManagementSystem;

public abstract class Vehicle { // zorunlu fieldlar
	private String _model;
	private String _brand;
	private int _year;

	public Vehicle(String brand, String model, int year) {
		_brand = brand;
		_model = model;
		_year = year;

	}

	// ortak metot( Vehicle classını miras alan her class için bu metot çağırılabilir.
	public void displayInfo() {
		System.out.println("Brand: " + _brand + ", Model: " + _model + ", Year: " + _year);
	}
	
	//Soyut metot(her miras alan bunu override etmeli)
	
	public abstract void startengine(); //soyut metodun gövdesi olmaz.
}
