package Oop_kısmı.SalaryCalculateSystem;

public class HourlyEmployee extends BaseEmployee {

	private int _hoursWorked;
	private double _hourlyRate;

	public HourlyEmployee(String _name, int _id, int hoursworked, double hourlyRate) {
		super(_name, _id); // üst sınıfın constructor'unu çağırıyoruz.
		_hoursWorked = hoursworked;
		_hourlyRate = hourlyRate;
	}

	
	@Override
	public double calculateSalary() {  // HourlyEmployee için override ettik.
		return _hourlyRate*_hoursWorked;

	}
}
