package Inheritance;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.age=26;
		Employee employee = new Employee();
		employee.id=5;
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.GetBill();
		
		
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.BestEmployee();
	}

}
