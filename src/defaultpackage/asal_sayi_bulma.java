package defaultpackage;

import java.util.Scanner;

public class asal_sayi_bulma {

	// Sayının asal olup olmadığını kontrol eden metod
	public static boolean asal_mi(int sayi) {
		// 2'den küçük sayılar asal değildir
		if (sayi < 2) {
			return false;
		}
		// Sayının 2'den başlayarak bölünebilirliğini kontrol et
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				// Eğer sayı i'ye tam bölünüyorsa, asal değildir
				return false;
			}
		}
		// Eğer hiçbir bölen bulamazsak, sayi asaldır
		return true;
	}

	public static void main(String[] args) {
		// asal sayı bulma:
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Bir sayı girin: ");
			int sayi = scanner.nextInt();

            // Kullanıcı 0 girerse döngüden çık
            if (sayi == 0) {
                System.out.println("Program sonlandırıldı.");
                break;
            }
            
            
			// Asallık kontrolü
			if (asal_mi(sayi)) {
				System.out.println(sayi + " bir asal sayıdır.");

			} else {
				System.out.println(sayi + " asal sayı değildir.");
			}
		}
		scanner.close(); // Scanner kaynaklarını kapatma
	}
}
