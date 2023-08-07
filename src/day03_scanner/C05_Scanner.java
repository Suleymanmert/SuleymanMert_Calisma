package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {


        // Kullanicidan bir dikdortgenin iki kenar uzunlugunu alip,dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dikdorgenin kenar uzunluklarini giriniz");

         double kenar1=scanner.nextDouble();
         double kenar2=scanner.nextDouble();

        System.out.println("Dikdörtgenin alani:"+ kenar1*kenar2);


    }
}
