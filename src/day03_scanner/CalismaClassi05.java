package day03_scanner;

import java.util.Scanner;

public class CalismaClassi05 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerini degistirin (swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Şutfen ilk sayiyi giriniz");
        int ilkSayi= scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();

        int temp = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = temp;

        System.out.println("ilk sayinin yeni degeri: " + ilkSayi);
        System.out.println("ikinci sayinin yeni degeri." + ikinciSayi);






    }
}
