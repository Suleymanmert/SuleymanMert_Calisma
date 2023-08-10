package day05;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        int a = 27;
        int b = 4;

        System.out.println(a/b); // 27 /4=6,75 === 6

        System.out.println(32/5); // 32/5=6

        double c =27;

        // eger bolunen sayıyı bolersenız sonucu tam sayı olarak sıze verir

        double sonuc1 = a / b; // 27 /4 =6,75

        System.out.println("Sonuc : " + sonuc1 ); // 6,0
        // A YI BYE BOLUN SONUCU  ONDALIKLI YAZIN

        double sonuc2 = (double)(a/b);
        System.out.println("Sonuc2 : " + sonuc2 ); //6,0

        double Sonuc3 =(double)a/b ;
        System.out.println("Sonuc3 : " + Sonuc3);// 6,75

        System.out.println(c/b); // 27 4 =6,75

        System.out.println(2567/10);// normalde 256,7 dir
        System.out.println(2567%10);//7

        System.out.println(256 / 10);// 25.6 = 25
        System.out.println(256/10);//6

        System.out.println(25/10);//2.5 =2
        System.out.println(25%10);//5

        System.out.println(2/10);//0,2=0
        System.out.println(2%10);//2


        System.out.println(2567 % 10);//  kalanı nı verecek 7


    }
    }

