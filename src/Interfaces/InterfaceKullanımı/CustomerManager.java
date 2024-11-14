package Interfaces.InterfaceKullanımı;

public class CustomerManager {

	private ICustomerDal _customerDal;

	public CustomerManager(ICustomerDal ıcustomerDal) {
		_customerDal = ıcustomerDal;
	}

	public void Delete() {
		System.out.printf("Customer Deleted.");
	}
}
