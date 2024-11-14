package Inheritance.InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		tarimKrediManager.Hesapla();
		
		KrediUI krediUI = new KrediUI(); //krediUI'ye BaseKrediManager parametre olarak verdik.Dolayısyla BaseKrediManager'i miras alan her class'ı burda kullanabiliriz.
		krediUI.KrediHesapla(new  OgretmenKrediManager());
		krediUI.KrediHesapla(new  TarimKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		
	}

	
}
