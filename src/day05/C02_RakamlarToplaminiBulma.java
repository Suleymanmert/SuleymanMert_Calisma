package day05;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // kullanıcıcan 3 basamaklı bir sayı alıp
        // sayının rakamlarını toplayıp yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı pozıtıf bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();

        int bierlerBasamagi =0;
        int rakamlarToplami= 0;



        // ilk sayi içiçn birler basamagini bulalim

        bierlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + bierlerBasamagi;

        // birler basamagindakı sayıyı aldık , artık ondan kurtulalım
        girilenSayi = girilenSayi / 10 ;

        // bu satira geldigimizde girilen sayiyi 2 basamaklı hale donusturduk

        bierlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + bierlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        // buraya geldigimizde artik sayimiz tek basamakli



        bierlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + bierlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        // buraya geldigimizde artik sayimiz tek basamakli

        System.out.println("Rakamlartoplami : " + rakamlarToplami);

    }

}

