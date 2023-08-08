package day03_scanner;

import java.util.Scanner;

public class CalismaClassi03 {
    public static void main(String[] args) {

        //  KUllanicidan ismini, soyismini ve yasini alıp, asagidaki formatta yazdirin.
        // isminiz : John
        // soyisminiz : Doe
        // yasiniz : 44
        // kaydiniz basarili bir sekilde gerceklesmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim= scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double girilenYas = scanner.nextDouble();

        System.out.println("isminiz : " + girilenIsim);
        System.out.println("soyisim: " + girilenSoyisim);
        System.out.println(" yasiniz: " + girilenYas);

        System.out.println("kaydiniz basarili bir sekilde gerceklesmistir.");




    }
}
