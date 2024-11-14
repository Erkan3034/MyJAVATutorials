package Oop_kısmı.SalaryCalculateSystem;

public class MonthlyEmployee extends BaseEmployee {
	private double _monthlySalary;

	public MonthlyEmployee(String _name, int _id, int monthlySalary) {

		super(_name, _id);
		_monthlySalary = monthlySalary;
	}

	public double calculateSalary() {
		return _monthlySalary;
	}
}
