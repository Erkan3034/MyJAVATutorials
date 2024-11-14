package defaultpackage;

import java.util.Scanner; // Kullanıcıdan giriş almak için gerekli kütüphane

// Temel Sınıf (Parent): Tüm sesli harfleri saklar
class SesliHarfKontrol {
    // Tüm sesli harfler dizisi
    protected char[] sesliHarfler = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

    // Harfin sesli olup olmadığını kontrol eden metod
    public boolean sesliMi(char harf) {
        // sesliHarfler dizisindeki her bir karakteri kontrol eder
        for (char sesli : sesliHarfler) {
            // Eğer girilen harf sesli harflerden birine eşitse, true döner
            if (harf == sesli) {
                return true;
            }
        }
        // Eğer hiçbiriyle eşleşmezse, false döner
        return false;
    }
}





// Alt sınıf1 : Kalın sesli harfleri kontrol eder
class KalinSesli extends SesliHarfKontrol {
    // Kalın sesli harfler dizisi
    private char[] kalinSesliler = {'a', 'ı', 'o', 'u'};

    // Harfin kalın sesli olup olmadığını kontrol eden metod
    public boolean kalinSesliMi(char harf) {
        // kalinSesliler dizisindeki her bir karakteri kontrol eder
        for (char kalin : kalinSesliler) {
            // Eğer girilen harf kalın sesli harflerden birine eşitse, true döner
            if (harf == kalin) {
                return true;
            }
        }
        // Eğer hiçbiriyle eşleşmezse, false döner
        return false;
    }
}




// Alt sınıf2 : İnce sesli harfleri kontrol eder
class InceSesli extends SesliHarfKontrol {
    // İnce sesli harfler dizisi
    private char[] inceSesliler = {'e', 'i', 'ö', 'ü'};

    // Harfin ince sesli olup olmadığını kontrol eden metod
    public boolean inceSesliMi(char harf) {
        // inceSesliler dizisindeki her bir karakteri kontrol eder
        for (char ince : inceSesliler) {
            // Eğer girilen harf ince sesli harflerden birine eşitse, true döner
            if (harf == ince) {
                return true;
            }
        }
        // Eğer hiçbiriyle eşleşmezse, false döner
        return false;
    }
}




// Ana program sınıfı
public class kalın_ince_sesli_harf_KALITIM {
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner sınıfı

        // Kullanıcıdan harf girişi al
        System.out.print("Bir harf girin: ");
        char harf = scanner.next().toLowerCase().charAt(0); // Harfi küçük harfe çevir

        // Sınıf nesneleri oluştur
        KalinSesli kalinSesliKontrol = new KalinSesli(); // Kalın sesli kontrol sınıfı nesnesi
        InceSesli inceSesliKontrol = new InceSesli();     // İnce sesli kontrol sınıfı nesnesi

        // Kontrolleri yap
        if (!kalinSesliKontrol.sesliMi(harf)) { // Harfin sesli olup olmadığını kontrol eder
            System.out.println(harf + " bir sesli harf değil.");
        } else if (kalinSesliKontrol.kalinSesliMi(harf)) { // Harf kalın sesli mi diye kontrol eder
            System.out.println(harf + " bir kalın sesli harf.");
        } else if (inceSesliKontrol.inceSesliMi(harf)) { // Harf ince sesli mi diye kontrol eder
            System.out.println(harf + " bir ince sesli harf.");
        }

        scanner.close(); // Kaynakları serbest bırakmak için Scanner'ı kapat
    }
}
