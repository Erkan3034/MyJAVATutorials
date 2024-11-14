package Oop_kısmı.SalaryCalculateSystem;

public class Main {

	public static void main(String[] args) {

		BaseEmployee baseEmployee = new HourlyEmployee("Erkan", 1, 42, 76.5);
		System.out.println(baseEmployee.getName() + "'s salary is: " + baseEmployee.calculateSalary());

		BaseEmployee baseEmployee2 = new SalariedEmployee("Aslı", 2, 5000.0);
		System.out.println(baseEmployee2.getName() + "'s salary is: " + baseEmployee2.calculateSalary());

		BaseEmployee baseEmployee3 = new MonthlyEmployee("Serkan", 3, 70000);
		System.out.println(baseEmployee3.getName() + "'s salary is: " + baseEmployee3.calculateSalary());

		
		
		//Classtan çağırım.
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Erkan", 5, 42, 76.5);
		double salary = hourlyEmployee.calculateSalary();
		System.out.println("\nID: " + hourlyEmployee.getId() + "\n" + salary);

	}

}
