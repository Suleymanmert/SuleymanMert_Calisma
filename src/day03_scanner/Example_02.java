package day03_scanner;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {

        // Kullanicidan bir double, birde int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bie double sayi giriniz");
        double girilenDouble = scanner.nextDouble();

        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenInt= scanner.nextInt();

        System.out.println("iki sayinin toplami :" + (girilenInt + girilenDouble));
        System.out.println("iki sayinin carpımı : " + girilenInt * girilenDouble);






    }

}
