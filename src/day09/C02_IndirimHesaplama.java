package day09;

import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adetini giriniz");
        int urunSayisi = scanner.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz");
        double listeFiyati= scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? E: evet,H:hayir");
        char kartVarMi= scanner.next().toUpperCase().charAt(0);

        // *** BURADA ***

        // ana degişken kart var mi bilgisi olsun.

        if (kartVarMi=='E') { // Karti olanlar

            // musteri karti varsa 10 urunden fazla alırsa %20, yoksa %15 indirim yapin.

            if (urunSayisi > 10) {
                System.out.println("%20 indirimli toplam fiyat:" + urunSayisi * listeFiyati * 80 / 100);
            } else {
                System.out.println("%15 indirimli toplam fiyat:" + urunSayisi * listeFiyati * 85 / 100);
            }
        }else if (kartVarMi=='H') {// karti olmayanlar
            // musteri karti yoksaa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.
            if (urunSayisi > 10) {
                System.out.println("%15 indirimli toplam fiyat:" + urunSayisi * listeFiyati * 85 / 100);
            } else {
                System.out.println("%10 indirimli toplam fiyat:" + urunSayisi * listeFiyati * 90 / 100);
            }
        }else { // hatali kart bilgisi
            System.out.println("kart bilgisi hatali");
        }

    }
}
