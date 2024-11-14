package defaultpackage;

public class ArrayApp {

	public static void main(String[] args) {
		
		//Array'lerde array elemanı üzerinde gezinmek için aşağıdaki for döngüsününün farklı kullanımı mevcut.
		
		double[] sayilar = {1.4,2.9,3.8,4.45,5.6,6.12,7.85};
		double max= sayilar[0];
		double total = 0;
		
		
		for( double sayi:sayilar) { //her elemanı gezinme
			if(max<sayi) {
				max=sayi;
			}
			
			total +=sayi;
			System.out.println(sayi); // her elemanı yazdırma
		}
		System.out.printf("Toplam : %f",total);
		System.out.println("");
		System.out.printf("En büyük :%f",max);
		
		
		System.out.println();
		
		
		
		String mesaj = "Bugün hava çok güzel";
		
		for( String  kelime : mesaj.split(" ")) { // kelimeye göre her kelimeyi alt alta yaz
			System.out.println(kelime);
		}
		
		String newMessage = mesaj.replace(" ", " - "); //değiştirme 
		
		System.out.println("4. eleman : " + mesaj.charAt(3));
		
		
		System.out.println(newMessage);
	}
	

}
