package defaultpackage;

public class methods {

	public static void main(String[] args) {
		
		System.out.println("Void fonksiyonlar(değer döndürmeyen, sadece verilen görevi yapan)");
		ekle();
		sil();
		guncelle();
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Return tipi(parametreli,değer döndüren) fonksiyonlar ");
		System.out.println();

		
		
		String mesaj =  kaydedildi("Erkan");  // burada return edilen değeri mesaj adlı bir değişkende tutup daha sonra yazdırırız.
		System.out.println(mesaj);
		
		System.out.println(kaydedildi("Erkan"));  // burda ise farklı bir kullanım mevcuttur. 
		
		
		System.out.println();
		
		
		
		String carpım = carp(15, 10);
		System.out.println(carpım);
		
		
		
		int toplam = topla(1,2,3,4,5,6,8,7,9,78,450); // arkaplanda int array'e depolanır. 
		
		System.out.println("Variable argument(...) ile yapılan Toplam : " + toplam);
	}
	
	// public static void bir metot tanımlar, işlem yapar fakat geri dönüş değeri yoktur.
	// public static {return} ise bir değeri döndürür.

	
	public static void ekle() {
		System.out.println("Eklendi ! ");
	}
	
	public static void sil() {
		System.out.println("Silindi ! ");
	}
	
	public static  void guncelle() {
		System.out.println("Güncellendi ! ");
	}
	
	
	//Return(parametreli fonksiyonlar)
	
	public static String kaydedildi(String isim) {
		return isim + ", hoşgeldin.Kaydın alınmıştır";
	}
	
	
	public static String carp(int sayi1, int sayi2) { // belirli miktarda parametre alan fonksiyon.
		return "Girilen sayıların çarpımı: " + (sayi1 * sayi2) ; 
	}
	
	
	public static int topla(int... sayilar) { // Gelen parametre miktarının değiştirği fonksiyonlarda. "Varianle argument(...) " kullanılır.
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam +=sayi;
		}
		return toplam;
	}
}
