package day10_switchCase_stringManipulations;

import java.util.Locale;

public class Example_04 {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDİR

      /*
       yukarida Java Candir olarak atadik
       sonra str.toUpperCase ile buyuk yazdirdik.
       ama degerini degistirmedik tek seferlik buyuk harfle yazdirdik. gecici yani.
       */

        str=str.toUpperCase();
        /*
        burada ise  kucuk olan degerimizi yeni str atayarak buyuk harf olarak atama yaptık.
         */
        System.out.println(str); // JAVA CANDİR  ****** işte burada buyuk harf le yazdirdi bizlere ******

        System.out.println(str.toLowerCase()); // java candir
        /*
        burada ise buyuk olan degerimizi tekrardan kucuk harf olarak yazdirdik.
         */


        // ********************ONEMLİ NOT *************************************

        // ********* eger yerel bir dile buyuk kucuk harf degisimi yapmak istersek ********

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

    }
}
