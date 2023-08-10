package day06_concatenation_matematikselOperatorler;

public class Example_02 {

    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        // NOT = javada = isareti esittir degildir atama isaretidir yani asignment (esaymıt)

        b = 2*a;

        // NOT  = javada esitligi kontrol etmek istersek == isaretini kullaniriz.

        System.out.println(b==2*a); // true

        System.out.println(3*b > 5*a);// true

        System.out.println(b > b-a); // true

        System.out.println(a <= b-a); // true


        System.out.println(!(a < b)); // true

        System.out.println(!(a < b)); // false

    }
}
