package day06_concatenation_matematikselOperatorler;

public class Example_01 {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

        // sadece yukaridaki variable lari kullanarak
        // asagidaki verilen metinleri yazdirin

        // Java35
        // Java15
        // 8Candir
        //53Java
        // 35 Java

        // Java35
        System.out.println(s1+a+b);// Java35

        // Java15
        System.out.println(s1+3*5);// Java15

        // 8Candir
        System.out.println(a+b+s2); // 8Candir

        //53Java
        System.out.println(b+s4+a+s1);//53Java
        System.out.println(s4+b+a+s1); // 53Java

        // 35 Java
        System.out.println(a+s4+b+s3+s1); // 35 Java


















    }
}
