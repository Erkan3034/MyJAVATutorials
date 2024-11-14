package Inputs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// değişkenler================

		String ad, soyad;
		int yas;
		double kilo;

		// ============================

		// Scanner sınıfını kullanarak veri alma
		Scanner data = new Scanner(System.in);
		// String veri alma.

		System.out.print("İsminizi giriniz: ");
		ad = data.nextLine(); // string veriyi al ve ad değişkenine ata.

		System.out.println();

		System.out.print("Soyadınızı giriniz: ");
		soyad = data.nextLine();

		System.out.println();

		System.out.print("Yaşınızı giriniz: ");
		yas = data.nextInt();

		System.out.println();

		System.out.print("Kilonuzu giriniz: ");
		kilo = data.nextDouble();

		System.out.println();

		System.out.print("Boyunuzu giriniz: ");
		float boy = data.nextFloat();

		double body_index = kilo /(Math.pow(boy, 2));

		System.out.println();

		System.out.println("İsim: " + ad);
		System.out.println("Soyisim: " + soyad);
		System.out.println("Yaş: " + yas);
		System.out.println("Kilo: " + kilo);
		System.out.println("Boy: " + boy);
		System.out.println("Vücut Kitle endeksi: " + body_index);

		// Scanner'ı kapatmak (gerekli değil, ama iyi bir uygulama)
		data.close();
	}

}
