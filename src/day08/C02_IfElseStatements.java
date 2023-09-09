package day08;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // SORU =>

        // Kullanicidan bir tam sayi isteyin
        // sayi 3 e bolunuyorsa 3 un kati
        // sayi 5 e bolunuyorsa 5 in kati
        // ikisine birden bolunuyorsa super sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi%3==0 && girilenSayi%5==0)
            System.out.println("Super sayi");
        else if (girilenSayi%3==0)
            System.out.println("3 un kati");
        else if (girilenSayi%5==0)
            System.out.println("5 in kati");
        else System.out.println("yaramaz sayi");
        }

    }

