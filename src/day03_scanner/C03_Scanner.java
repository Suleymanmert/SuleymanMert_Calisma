package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir double, birde int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner= new Scanner(System.in); // birinci adim

        System.out.println("Lutfen bir double sayi aılınız"); // ikinci adim
        double girilenDouble= scanner.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");// ikinci adim
        int girilenInt= scanner.nextInt();
        // bizden iki frkli sayi turu istedigi icin iki ayri birsekilde mesaj yolluyoruz.




        System.out.println("iki sayinin toplami: " + (girilenInt + girilenDouble));
        System.out.println("iki sayinin carpimi: " + girilenInt * girilenDouble);

    }
}
