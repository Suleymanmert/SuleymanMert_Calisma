package day09;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayinin tek mi cift mi oldugunu yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scanner.nextInt();

        if (sayi%2==0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        /*
        IF ELSE ile yapabilecegimiz asit işlemleri daha kisa olarak yazabilmek için TERNORY kullanilir.
         */

        System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");
    }
}
