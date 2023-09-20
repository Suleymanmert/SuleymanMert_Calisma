package day11_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {
        String str = "Java Candir";

        /*
        substring () bize verilen bir Stringin istenen parcaasini alma imkani tanir

        2 turlu kullanimi vardir
        1-baslangic index ini verirseniz, o indexten sona kadar olan kismi verir

         */

        System.out.println(str.substring(3)); // a Candir

        System.out.println(str.substring(7));// ndir

        System.out.println(str.substring(0));// Java Candir

        // System.out.println(str.substring(11)); // StringIndexOutoOfBoundsException

        System.out.println(str.substring(3,6)); // a C

        System.out.println(str.substring(5,10)); // Candi

        System.out.println(str.substring(1,2)); // a

        System.out.println(str.substring(6,7)); // a

        // bu yazin bize istenen index teki tek vir elementi verir
        // charAt() e benzer ama arti bir özelligi var
        //substring bize String verdigi icin manipulation yapmaya devam edebiliriz

        //6.indexdeki harfi buyuk harff olarak yazdirin
        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3)); // hiclik yazdirir

        // System.out.println(str.substring(8,5)); // .StringIndexOutOfBoundsException


        // son 3 harfi yazdirin
        System.out.println(str.substring(str.length()-3)); // dir



        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";
        System.out.println(str1+ str2 + str3); // Java Candir
        System.out.println(str1.concat(str2).concat(str3)); // Java Candir



    }
}


