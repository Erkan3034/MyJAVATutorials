package Oop_kısmı;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Yeni bir BankAccount nesnesi oluşturuluyor
     BankAccount account = new BankAccount("Erkan TURGUT", "1234567890", 1000);

     // Hesap bilgilerini gösterme
     System.out.println("Hesap Sahibi: " + account.getAccountHolderName());
     System.out.println("Hesap Numarası: " + account.getAccountNumber());
     System.out.println("Güncel Bakiye: " + account.getBalance() + " TL");

     // Para yatırma işlemi
     account.deposit(500);

     // Para çekme işlemi
     account.withdraw(300);

     // Hesap sahibinin adını güncelleme
     account.setAccountHolderName("Serkan TURGUT");
     System.out.println("Yeni Hesap Sahibi: " + account.getAccountHolderName());
 }
}
