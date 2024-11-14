package Oop_kısmı;

//BankAccount.java
public class BankAccount {
 // Private alanlar, dışarıdan doğrudan erişimi kısıtlar
 private String _accountHolderName;
 private String _accountNumber;
 private double _balance;

 
 
 // Constructor: Yeni bir hesap oluşturmak için(parametreleri buna vereceğiz)
 public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
     _accountHolderName = accountHolderName;
     _accountNumber = accountNumber;
     _balance = initialBalance;
 }

 
 
 // Getter metodları: Özel verilere erişim sağlamak için
 public String getAccountHolderName() { // verilen ismi return et
     return _accountHolderName;
 }

 public String getAccountNumber() { // verilen hesap numarasını return et.
     return _accountNumber;
 }

 public double getBalance() {   // bakiyeyi return et.
     return _balance;
 }

 // Setter metodu: Hesap sahibinin adını değiştirmek için
 public void setAccountHolderName(String accountHolderName) {
     _accountHolderName = accountHolderName;
 }

 // Para yatırma işlemi
 public void deposit(double amount) {
     if (amount > 0) {
         _balance += amount;
         System.out.println(amount + " TL yatırıldı. Güncel bakiye: " + _balance + " TL");
     } else {
         System.out.println("Yatırılacak miktar sıfırdan büyük olmalı.");
     }
 }

 // Para çekme işlemi
 public void withdraw(double amount) {
     if (amount > 0 && amount <= _balance) {
         _balance -= amount;
         System.out.println(amount + " TL çekildi. Güncel bakiye: " + _balance + " TL");
     } else {
         System.out.println("Geçersiz işlem: Yetersiz bakiye veya geçersiz miktar.");
     }
 }
}
