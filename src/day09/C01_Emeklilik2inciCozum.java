package day09;

import java.util.Scanner;

public class C01_Emeklilik2inciCozum {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.




         Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz E: Erkek,K: Kadin");
        char cinsiyet =scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scanner.nextDouble();


        if (yas<10 || yas >80 ){
            System.out.println("gecersiz yas");
        }else if (yas<60) {// kimse emekli olamaz
            if (cinsiyet == 'K') {
                System.out.println("kadin emekli olabilmesi icin daha " + (60 - yas) + " yil daha calismali");
            } else if (cinsiyet == 'E') {
                System.out.println("erkek emekli olabilmesi icin daha " + (60 - yas) + " yil daha calismali");
            } else {
                System.out.println("cinsiyet hatali");

            }
        }else if (yas<65){// sadece kadınlar emekli olabilir
            if (cinsiyet =='K'){
                System.out.println("sadece kadinlar emekli olabilir");
            }else if (cinsiyet == 'E') {
                System.out.println("erkek emekli olabilmesi icin"  + (65 - yas) + " yil daha calismali");
            }else {
                System.out.println("cinsiyet hatli");
            }

            }else {// herkes emekli olabilir
            if (cinsiyet=='K'|| cinsiyet=='E'){
                System.out.println("Emeki olabilir");
            }
        }
    }
}

