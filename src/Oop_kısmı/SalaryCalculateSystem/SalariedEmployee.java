package Oop_kısmı.SalaryCalculateSystem;

public class SalariedEmployee extends BaseEmployee {

	private double _weeklySalary;

	public SalariedEmployee(String _name, int _id, double weeklySalary) {
		super(_name, _id);
		_weeklySalary = weeklySalary;

	}

	public double calculateSalary() {
		return _weeklySalary;

	}
}
