package Inheritance.InheritanceDemo;

public class KrediUI {

	public void KrediHesapla(BaseKrediManager baseKrediManager) { 
		//Bu KrediUI için parametre verdik. Her bir Manager için farklı farklı paramatere vermek yerine 
		//hepsinin dahil olduğu "basekredimanager" classını parametre olarak verdik,
		//bu sayede her miras alan class için bu KrediUI işemleri gerçekleşmiş olacak.
		
		System.out.println("Kredi UI için kredi hesaplandı !");
	}
}
