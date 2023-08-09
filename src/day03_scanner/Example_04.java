package day03_scanner;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin iki kenar uzunlugunu alip,dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ddikdortgenın kenar uzunluklarını giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("dikdortgen alani ." + kenar1*kenar2);

    }
}
