package day06_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        // NOT = javada = isareti esittir degildir atama isaretidir yani asignment (esaymıt)

        b = 2*a;

        // NOT  = javada esitligi kontrol etmek istersek == isaretini kullaniriz.


        System.out.println( b == 2*a); // 20 == 20 ==> true

        // asignmet ta esitligin sol tarafinda sadece variable bulunur.
        // sol tarafta matematiksel islemler olmaz
        // karsilasrirma operatorlerinde iki tarafta işlem olabilir

        System.out.println( 3*b > 5*a ); // 60 > 50 == true
        System.out.println( b >= b-a ); // 20 >= 10 == true
        System.out.println( a <= b-a ); // 10 <= 10 == true

        // java da karsilastırma operatorlerinde kullanilan ( ! ) işareti
        //        booleon degeri tersine cevirir.

        System.out.println( a < b ); // 10 < 20 == true
        System.out.println( ! (a < b)); // 10 < 20 == true = false
        System.out.println( a != b); // 10 = 20 = true
    }
}
