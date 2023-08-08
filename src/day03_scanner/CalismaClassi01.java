package day03_scanner;

import java.util.Scanner;

public class CalismaClassi01 {

    public static void main(String[] args) {


        // Kullanicidan bir tam sayi alip, karesini yazdirin.

        Scanner scanner = new Scanner(System.in); // 1 adim

        System.out.println("Lutfen bir tam sayi giriniz"); // 2 adim

        int girilenSayi = scanner.nextInt();

        System.out.println("girilen sayinin karesi.:" + girilenSayi*girilenSayi);

    }
}
