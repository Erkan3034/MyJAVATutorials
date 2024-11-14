package Classlar.RecapDemoClasses;


//CLASSLAR ORTAK OPERASYONLARI TUTAR....
public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();

		int sonuc = dortIslem.Topla(5, 9);
		System.out.println("Sonuc : " + sonuc);
		
		int sonuc1 = dortIslem.Carp(5, 9);
		System.out.println("Sonuc : " + sonuc1);
		
		int sonuc2 = dortIslem.Cıkar(5, 9);
		System.out.println("Sonuc : " + sonuc2);
		
		int sonuc3 = dortIslem.Bol(5, 9);
		System.out.println("Sonuc : " + sonuc3);
	}

}
