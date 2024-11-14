package Oop_kısmı.SalaryCalculateSystem;

public class BaseEmployee {
	// Ana sınıfta her alt sınıfta bulunan ORTAK özellikler:
	private String _name;
	private int _id;

	public BaseEmployee(String name, int id) { // CONSTRUCTOR
		_name = name;
		_id = id;
	}

	
	// İsim ve id aldık ve bunları almak için getter metodu kullanmamız lazım.

	public String getName() { // gelen ismi döndür.
		return _name;
	}

	public int getId() { // id'yi döndür.
		return _id;
	}

	// Polyrmorhism ile override edilecek metot.(maaş hesaplama)

	public double calculateSalary() { // Alt sınıflar bu metodu kendine göre override edecek.
		return 0.0;

	}
}
