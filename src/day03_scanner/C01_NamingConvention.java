package day03_scanner;

public class C01_NamingConvention {

    public static void main(String[] args) {

        int sayi =20;

        //int sayi=41; *** aynı data turleri olan variable yı kabul etmez
        //String sayi= 96; *** data turlerini degistirsekte kabul etmez
        //long sayi=12;  ***  yine kabul etmedi

        int Sayi = 78;
        int SAYİ = 85; // 85
        int saYi = 14; // 14
        // *** variable buyuk kucuk harflere duyarlıdir ama yine
        // variable buyuk kucuk harfleri kabul etsede genel kullanimda kullanilmaz yani aykiridir.

        System.out.println(saYi);
        System.out.println(SAYİ);


        int say_i=120;
        int say12i=41;
        int say$i=52;

        System.out.println(say12i);// 41
        System.out.println(say$i);// 52
        System.out.println(say_i);//120





    }
}


