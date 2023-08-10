package day06_concatenation_matematikselOperatorler;

public class Example_04 {
    public static void main(String[] args) {

        System.out.println(3 > 6 || 6 > 5 ); // true

        System.out.println( 7 > 6 || 3 < 4);  // true

        System.out.println( 3 < 1 || 4 < 3); //false


        int sayi = 228;
        System.out.println(sayi % 2 ==0 || sayi % 3==0); // true
        System.out.println( sayi % 7 ==0 || sayi% 5 ==0); // false

        System.out.println( sayi < 0 || sayi < 100); // false

    }
}
