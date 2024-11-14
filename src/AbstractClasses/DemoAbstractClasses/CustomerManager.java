package AbstractClasses.DemoAbstractClasses;

public class CustomerManager {

	BaseDataBaseManager databaseManager;
	public void getCustomer() {
		databaseManager.getData(); // burada dataBasemanager'a hangi parametreyi(oracle,sql...) gönderirsek onun getData'sı çalışır.
		
	//	OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager(); // Bu tamamen bağımlı bir kullanım, burda Oracle yerine SQL almak istediğimizde uzun işemler ya da hatalarla karşılaşırız. Bunun yerine Anne sınıfı Ynai BaseDatabaseManager kullanırız.
	}
}
