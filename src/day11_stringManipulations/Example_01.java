package day11_stringManipulations;

public class Example_01 {
    public static void main(String[] args) {

        String str = "Java Candir";

        // ilk harfi yazdirin
        System.out.println(str.charAt(0)); // J

        // 7.harfi yazdirin
        System.out.println(str.charAt(6)); // a

        // bu metnin uzunlugı 11
        // son harfi yazdirin
        System.out.println(str.charAt(11-1)); // r

        // sondan 3.harfi yazdirin
        System.out.println(str.charAt(11-3)); // d

        // 4.harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(3)); // A
    }
}
