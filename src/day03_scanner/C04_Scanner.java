package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //  KUllanicidan ismini, soyismini ve yasini alıp, asagidaki formatta yazdirin.
        // isminiz : John
        // soyisminiz : Doe
        // yasiniz : 44
        // kaydiniz basarili bir sekilde gerceklesmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double girilenYas = scanner.nextDouble();

        System.out.println("isminiz: " + girilenIsim);
        System.out.println("soyisminiz:" + girilenSoyisim);
        System.out.println("yasiniz:" + girilenYas);

        System.out.println("kaydiniz basarili bir sekilde kaydedilmistir");

    }
}
