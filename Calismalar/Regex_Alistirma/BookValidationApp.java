package Regex_Alistirma;
import java.util.Scanner;
import java.util.regex.Pattern;

// Cstom Hata sınıfi belirleme 
class ValidationException extends Exception {
	
	private static final long serialVersionUID = 1L ; //`serialVersionUID`, serileştirme uyumluluğunu sağlamak için sınıf sürümünü tanımlar ve belirler. bu yüzden bunu eklememiz proje açısından kritik öndeme sahip.
	
    public ValidationException(String message) {
        super(message);
    }
}

// Ana uygulama sınıfı
public class BookValidationApp {

    // Kitap plakası kontrol fonksiyonı...
    public static void validateBookPlate(String bookPlate) throws ValidationException { //uygulamanın hata fırlatma durumu olduğu için özel hata sınıfımızı kullanmak için throws kullanıyorm
        // Örnek plaka formatı: "KTP-12345" veya "BK-56789" 
        String pattern = "^[A-Z]{2,4}-\\d{4,6}$"; //a-z arası 2-4 arası karakter + 4-6 adet digit yani rakam içermeli ....
        
        if (!Pattern.matches(pattern, bookPlate)) {  //kontrol kısmi
            throw new ValidationException("Geçersiz kitap plakası! Örnek: 'KTP-12345' veya 'BK-56789'"); //custom hata sınıfı 
        }
    }

    
    
    // URL kontrol fonksiyonu...
    public static void validateURL(String url) throws ValidationException {
        String pattern = "^(https?:\\/\\/)?([\\w\\-]+)\\.([a-z]{2,6})(\\/[\\w\\-]*)*\\/?$"; //http veya https ile başlamalı,// içermeli(opsiyonel), karakter olmalı, . olmalı , 
        if (!Pattern.matches(pattern, url)) {
            throw new ValidationException("Geçersiz URL! Örnek: 'https://example.com'");
        }
    }

    
    
    // ISBN kontrol fonksiyonu
    public static void validateISBN(String isbn) throws ValidationException {
        String pattern = "^(97(8|9))?\\d{9}(\\d|X)$";
        if (!Pattern.matches(pattern, isbn)) {
            throw new ValidationException("Geçersiz ISBN numarası! Örnek: '9781234567897'");
        }
    }

    
    
    
    // Ana akış kısmı 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Kullanıcıdan bilgiler al
            System.out.print("Kitap plakasını girin (örn. 'KTP-12345'): ");
            String bookPlate = scanner.nextLine();
            validateBookPlate(bookPlate);
            System.out.println("Kitap plakası geçerli....");

            
            
            System.out.print("URL girin (örn: 'https://example.com'): ");
            String url = scanner.nextLine();
            validateURL(url);
            System.out.println("URL geçerli..");

            
            
            System.out.print("ISBN numarasını girin (örn. '9781234567897'): ");
            String isbn = scanner.nextLine();
            validateISBN(isbn);
            System.out.println("ISBN numarası geçerli....");

            
            
        } catch (ValidationException e) {
            // Hata mesajını yazdır
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
