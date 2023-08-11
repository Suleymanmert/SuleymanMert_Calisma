package day08;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        // SORU
         // ögrencini almis oldugu notları alın,
        // ögerncinin notu 85 ve ustu ise AA,
        // (85 ve ustu degilse) 65 ve ustu ise BB,
        // (65 ve ustu degilse) 50 ve üstü ise CC,
        // geriye kalanlar ise DD,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >=85){
            System.out.println("AA");
        }else if (not >=65){
            System.out.println("BB");
        }else if (not>=50){
            System.out.println("CC");
        }else {
            System.out.println("DD");
        }

    }
}
