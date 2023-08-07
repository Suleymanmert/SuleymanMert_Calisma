package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir tam sayi alip, karesini yazdirin.

        // Scanner clasindan bir bilgiyi 3 adimda isteyebiriz yada yazdirabiliriz.

        // birinci adim olarak

        Scanner scanner = new Scanner(System.in);

        // ikinci adim olarakta ne istedigimizi belirtmeliyiz yada mesaj olarak göndermeliyiz.

        System.out.println("Lütfen bir tam sayi giriniz");

        // ücüncü adim ise vede son olarakta scanner classindan bir tam sayi alıp onun karesini yazdiralim.

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayini karesi: " + girilenSayi*girilenSayi);
         // ve artik kod olustu istedigimiz sonucu alabiliriz.



    }
}
