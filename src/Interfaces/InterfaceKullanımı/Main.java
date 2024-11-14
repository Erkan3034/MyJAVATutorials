package Interfaces.InterfaceKullanımı;

//interface'ler de referans tutabiliyor.
public class Main {

	public static void main(String[] args) {
		
		ICustomerDal customerDal1 = new MySqlCustomerDal(); // SQL ile çalışan müşteri.
		customerDal1.Add();
		
		
		ICustomerDal customerDal2 = new MyOracleCustomerDal(); //Oracle ile çalışan müşteri
		customerDal2.Add();
		
		ICustomerDal customerDal3 = new MyMongodbCustomerDal();
		customerDal3.Add();
		
		
		//CustomerManager'in constructor ile kullanımı.
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.Delete();
		
	}

}
