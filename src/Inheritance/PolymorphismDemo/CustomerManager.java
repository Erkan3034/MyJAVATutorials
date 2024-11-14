package Inheritance.PolymorphismDemo;

public class CustomerManager {

	private BaseLogger _baseLogger;
	
	
	public CustomerManager(BaseLogger logger) { //constructor(Burada Base verdik yani Base classını inherit eden her clas bunun için geerli olur.(ör:File,Database)
		
		_baseLogger=logger; 
	}
	
	public void add() {
		System.out.println("EKLENDİ!" );
		_baseLogger.log("✔️");
		
		/*//Bu kullanım bizi Database'e bağımlı hale getirir. Buna düşmemek için Filed tanımı ile ilerleyeceğiz.(constructor)
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("Database'e eklendi");
		*/
	}
}
