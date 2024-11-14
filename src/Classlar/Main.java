package Classlar;

public class Main {

	public static void main(String[] args) {

		// classes are reference typed.(stored in heap)

		CustomerManager customer; // = new CustomerManager(); " customer=customer2;" bu işlemi yaptığımız için
									// gereksiz new nesnesini silebillirz.

		CustomerManager customer2 = new CustomerManager();

		customer = customer2;

		// classes are reference typed.(stored in Stack - heap) Referans tipler ise
		// değişkenin bellekteki veriye olan referansını (adresini) saklar. Referans
		// tipi bir değişken aslında verinin saklandığı yeri gösteren bir referanstır.

		// customer = bellekte üretilen nesne
		customer2.Add();
		customer.Delete();
		customer.Update();

		//=======================================================================================
		// value types:

		// value types stored ind Stack

		int sayi1 = 15;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); // 15 ( değer tip -> sadece o an verilen değerini alır)

		// reference types(String, Array, Object, ArrayList)

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };

		sayilar1 = sayilar2;
		sayilar1[0] = 25;

		System.out.println(sayilar2[0]); // Çıktı:25

	}

}
